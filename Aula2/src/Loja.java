public class Loja {
    public static void main(String[] args) {
        Livro livro = new Livro("Republica", 101, "Platão", 350);

        System.out.println(livro.ehGrande());
        System.out.println(livro.ehCaro());

        System.out.println(livro.getAutor());
    }
}
