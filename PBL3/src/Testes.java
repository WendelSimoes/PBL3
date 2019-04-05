import java.util.ArrayList;

public class Testes {
    public static void main(String[] args) {
        Html paragrafo = new Paragrafo();
        Html link = new Link();
        Html lista = new Lista();
        
        paragrafo.setTamanho(10);
        link.setTamanho(10);
        lista.setTamanho(10);
        
        ArrayList<Html> html = new ArrayList<Html>();
        html.add(paragrafo);
        html.add(link);
        html.add(lista);
        
        Desktop desktop = new Desktop();
        desktop.setHtml(html);
        
        System.out.println("Redimensionamento do desktop para 10 de tamanho:");
        System.out.println(desktop.getHtml().get(0).getTamanho());
        System.out.println(desktop.getHtml().get(1).getTamanho());
        System.out.println(desktop.getHtml().get(2).getTamanho());
        
        paragrafo.setTamanho(10);
        link.setTamanho(10);
        lista.setTamanho(10);
        
        Celular celular = new Celular();
        celular.setHtml(html);
        
        System.out.println("Redimensionamento do celular para 10 de tamanho:");
        System.out.println(celular.getHtml().get(0).getTamanho());
        System.out.println(celular.getHtml().get(1).getTamanho());
        System.out.println(celular.getHtml().get(2).getTamanho());
    }   
}
