class Main {
    public static void main(String[] args) {
        String input = args[0];
        ISBN isbn;
        isbn = new ISBN(input);
        String result = isbn.validate();
        System.out.println(result);
    }
}