public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setIdUsuario(1);
        usuario1.setNome("Chico Bento");
        usuario1.setTipoUsuario(TipoUsuario.OPERADOR);

        System.out.println(usuario1.getTipoUsuario());
    }
}