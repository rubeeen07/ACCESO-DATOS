public class Animal implements AutoCloseable {
    private String apodo;

    public Animal(String apodo) {
        this.apodo = apodo;
    }

    public String getApodo() {
        return apodo;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Animal cerrado");
    }
}
