public class CostePersonal {
    private static float costeFinal = 0;
    private static Trabajador trabajador;

    static float CosteDelPersonal(Trabajador trabajadores[]) {

        for (int i = 0; i < trabajadores.length; i++) {
            trabajador = trabajadores[i];
            if (EsDirectorOTrabajador()) { CosteDirectores(trabajador); } else { CosteTrabajadores(trabajador); }
        }
        return costeFinal;
    }
    private static void CosteDirectores(Trabajador trabajador) {
        costeFinal += trabajador.getNomina();
    }
    private static void CosteTrabajadores(Trabajador trabajador) {
        costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
    }
    public static boolean EsDirectorOTrabajador() {
        boolean esDirector;
        if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
            esDirector = true;
        } else esDirector = false;
        return esDirector;
    }
}
