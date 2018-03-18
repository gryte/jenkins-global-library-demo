package com.michaelheap;

def execute() {
  node {
    dir('dist') {
      archiveArtifacts artifacts: '*.zip', fingerprint: true;
    }
  }
}
