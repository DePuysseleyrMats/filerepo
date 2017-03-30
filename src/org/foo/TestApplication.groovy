package org.foo;

def execute() {
  node {
            echo 'beginnning workflow...'       
    
            stage 'prepare gems'
            sh '''#!/bin/bash
            source /usr/local/rvm/scripts/rvm
            rvm use 2.1.5
            echo $PATH
            ruby --version
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
            bundle exec rake test
            '''
            
            stage 'beaker testing'
            sh '''#!/bin/bash
            source /usr/local/rvm/scripts/rvm
            bundle exec rake beaker
            '''  
          }
}

return this;
