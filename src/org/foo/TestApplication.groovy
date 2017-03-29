package org.foo;

def execute() {
  node {
            echo 'beginnning workflow...'
            which bundle
    
            stage 'prepare gems'
            sh '''#!/bin/bash           
            gem update bundler
            gem --version
            gem update --system
            bundle install --path=.bundle/gems/
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
