import com.musicplayerapp.calculos.FiltroRecomendacion;
import com.musicplayerapp.modelos.Cancion;
import com.musicplayerapp.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();

        miCancion.setTitulo("Ella y yo");
        miCancion.setArtista("Aventura Ft. Don Omar");
        miCancion.setNombreAlbum("God's Project");
        miCancion.setGenero("Bachata");
        miCancion.setDuracionMinutos(4.35);
        miCancion.reproducir();
        miCancion.reproducir();
        miCancion.darMeGusta();
        miCancion.darMeGusta();
        miCancion.darMeGusta();
        miCancion.darMeGusta();
        miCancion.darMeGusta();
        miCancion.setClasificacion(4.5);

        System.out.println(miCancion);
        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtrar(miCancion);

        Podcast miPodcast = new Podcast();

        miPodcast.setTitulo("Los hombres sí lloran");
        miPodcast.setPresentador("Juan Pablo Raba");
        miPodcast.setEpisodio(1);
        miPodcast.setDescripcion("Este es un espacio seguro dedicado a explorar y romper, juntos, con los estigmas y estereotipos que rodean la salud mental.\n" +
                "Junto a mi gran amigo y productor, Dani Posada, traeremos conversaciones sinceras con amigos extraordinarios y entrevistas con expertos que nos ofrecerán consejos y herramientas para transitar la vida y, por supuesto, nuestra salud mental. Porque está bien no estar bien, pero no lo está creer que tienes que hacerlo solo.\n" +
                "Este, nuestro espacio, es seguro y se llama “Los hombres sí lloran\", donde la vulnerabilidad es nuestra mayor fortaleza.\n" +
                "Gracias por estar aquí.");
        miPodcast.setDuracionMinutos(53.9);
        miPodcast.reproducir();
        miPodcast.reproducir();
        miPodcast.reproducir();
        miPodcast.darMeGusta();
        miPodcast.setClasificacion(4.8);

        System.out.println(miPodcast);

        filtro.filtrar(miPodcast);

    }
}
