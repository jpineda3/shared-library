// vars/sayHello.groovy
def call(String name = 'World') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello ${name}!"
}

def toUser() {
    echo "Hello ${currentBuild.getBuildCauses('hudson.model.Cause$UserIdCause').userName}!"
}