package org.foo;

def execute() {
  node {
            echo 'beginnning workflow...'
    
            stage 'prepare gems'
            sh '''#!/bin/bash
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
            bundle exec rake test
            '''
            
            stage 'beaker testing'
            sh '''#!/bin/bash
            bundle exec rake beaker
            '''  
          }
}

return this;
