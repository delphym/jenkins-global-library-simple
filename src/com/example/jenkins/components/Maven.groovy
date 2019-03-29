package com.example.jenkins.components

def test() {
    // Abstracting simple commands like this enables us to 
    // wrap them in other functionality, like for example
    // specifying custom maven config.
	
	// if (isUninx()) {
	// 	sh 'mvn verify'
	// } else {
	// 	bat('mvn verify')
	// }

	echo 'mvn verify'
}

def package() {
	// if (isUnix()) {
	// 	sh 'mvn package -Dmaven.test.skip=true'
	// } else {
	// 	bat('mvn package -Dmaven.test.skip=true')
	// }

	echo 'mvn package -Dmaven.test.skip=true'

}

return this