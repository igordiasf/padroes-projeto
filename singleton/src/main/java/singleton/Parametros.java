package singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String windows;
    private String userLogado;

    public String getwindows() {
        return windows;
    }

    public void setwindows(String windows) {
        this.windows = windows;
    }

    public String getUserLogado() {
        return UserLogado;
    }

    public void setUserLogado(String userLogado) {
        this.userLogado = userLogado;
    }
}
