package org.foo;

def execute() {
  node {
            echo 'beginnning workflow...'
          
            stage 'prepare gems'
            sh '''
            gem update bundler
            gem --version
            gem update --system
            bundle install --path=.bundle/gems/
            '''
          
            stage 'rspec testing'
            sh '''
            bundle exec rake test
            '''
            
            stage 'beaker testing'
            sh '''
            bundle exec rake beaker
            '''  
          }
}

return this;
