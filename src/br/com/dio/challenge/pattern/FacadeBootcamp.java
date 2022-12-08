package br.com.dio.challenge.pattern;

import br.com.dio.challenge.domain.Bootcamp;

public class FacadeBootcamp {

    private final BootcampRepository rBootcamp;

    public FacadeBootcamp() {
        this.rBootcamp = new BootcampRepository();
    }

    private static final class InstanceFacadeBootcampHolder {
        static private final FacadeBootcamp instanceFacadeBootcamp = new FacadeBootcamp();
    }

    //Lazy INITIALIZATION
    public static FacadeBootcamp getCurrentInstance(){
        return InstanceFacadeBootcampHolder.instanceFacadeBootcamp;
    }


    public void createBootcamp(Bootcamp b) {
        this.rBootcamp.create(b);
    }

    public void adicionarObservador(Observador observador) {
        this.rBootcamp.adicionarObservador(observador);
    }

}
