package StreamsAPI;

class GenericClassWithType {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return a DataContainer instances for Strings
    static public DataContainer<String> createStringDataContainer() {
        // Alter this code to return a DataContainer with String for the parameterized type
        // Give it the value "Hello"
        return new DataContainer<>("Hello");
    }

}

// Mention T as the parameterized type and use it to create a DataContainer instance for Strings with the value "Hello"
class DataContainer<T> {
    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
