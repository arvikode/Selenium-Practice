public class SingletonClass {

    // For a singleton design pattern we need 1 of each a private static variable, private constructor and a public getter.
    // The getter must not create a new instance everytime.
    // The getter should create 1 instance and then return the same methods ask for the instance

    private static SingletonClass browser;

    private SingletonClass(){
        // To prevent Reflection api attacks we add an if statement to check the state of the instance is null for the first instance creation
        if (browser != null) {
            throw new IllegalArgumentException("object already exists");
        }
    };

    // sync issue - Using synchronized keyword after pubilc keyword in the method could cause a performance issue due to serial access of the instance
    public static SingletonClass getBrowser(){
        // sync issue can be resolved by syncing just the creation of the instance
        // that way a copy of the same instance can be sent to parallel threads
        if (browser == null) {
            synchronized (SingletonClass.class) {

                if (browser == null) {
                    SingletonClass browser = new SingletonClass();
                }
            }
        }

        return browser;
    }
}
