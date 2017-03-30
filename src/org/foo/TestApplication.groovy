package org.foo;

def execute() {
  def workspace = pwd()
  def gemfile = libraryResource 'org.foo.GemFile'
  writeFile file: '${workspace}/Gemfile', text: gemfile
  node {
            checkout scm
            echo 'beginnning workflow...'       
              
            stage 'prepare gems'
            sh '''#!/bin/bash
            source /usr/local/rvm/scripts/rvm
            rvm use 2.1.5
            bundle -v
            gem update --system
            gem update bundler
            gem --version
            gem update --system
            bundle install --path=vendor/bundle
            '''
                      
            stage 'rspec testing'
            sh '''#!/bin/bash
            source /usr/local/rvm/scripts/rvm
            bundle exec rake test SPEC_OPTS="--format documentation" 
            '''
            
            stage 'beaker testing'
            sh '''#!/bin/bash
            source /usr/local/rvm/scripts/rvm
            VBoxManage --version
            bundle exec rake beaker SPEC_OPTS="--format documentation" 
            '''  
          }
}

return this;
