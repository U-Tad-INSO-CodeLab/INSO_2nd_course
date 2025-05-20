package comportamiento.observer;

import java.util.ArrayList;

public class Canal1 implements Canal {
    private ArrayList<Suscriptor> suscriptores;
    private int videos;

    public Canal1(){
        this.suscriptores = new ArrayList<>();
    }

    public void setVideos(int videos){
        this.videos = videos;
        this.notificarSuscriptores();
    }

    @Override
    public void suscribir(Suscriptor suscriptor) {
        suscriptores.add(suscriptor);
    }

    @Override
    public void elminarSuscriptor(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
    }

    @Override
    public void notificarSuscriptores(){
        for(Suscriptor suscriptor : suscriptores){
            suscriptor.actualizar(this.videos);
        }
    }
}