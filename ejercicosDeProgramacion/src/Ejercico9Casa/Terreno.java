package Ejercico9Casa;

public class Terreno {
    private Casa casa;
    private double metros;
    private Orientacion orientacion;
    private double valoracion;

    public Terreno(double metros, Orientacion orientacion, double valoracion) {
        this.metros = metros;
        this.orientacion = orientacion;
        this.valoracion = valoracion;
        this.casa = null;
    }

    public void construirCasa(double metrosCasa) throws Exception {
        if (metrosCasa > metros) {
            throw new Exception(" No se puede construir la casa. Terreno insuficiente.");
        }
        if (casa != null) {
            throw new Exception(" Ya existe una casa en el terreno.");
        }
        casa = new Casa(metrosCasa);
        metros -= metrosCasa;
        System.out.println(" Casa construida en el terreno.");
    }

    public void revalorizarCasa() {
        if (casa == null) {
            System.out.println("⚠ No hay casa en el terreno. No se puede revalorizar.");
            return;
        }

        double incremento = 0;

        if (casa != null) incremento += 0.25;
        if (casa != null && casa.metros > 100) incremento += 0.05;
        if (casa != null && casa.piscina) incremento += 0.20;

        if (orientacion == Orientacion.NORTE || orientacion == Orientacion.SUR) {
            incremento += 0.10;
        } else if (orientacion == Orientacion.ESTE || orientacion == Orientacion.OESTE) {
            incremento += 0.05;
        }

        valoracion += valoracion * incremento;
        System.out.println(" Nueva valoración del terreno: " + valoracion + "€.");
    }

    public Casa getCasa() {
        if (casa == null) {
            System.out.println(" No hay casa en este terreno.");
        }
        return casa;
    }

    public void mostrarDatos() {
        System.out.println(" Terreno: " + metros + "m², Orientación: " + orientacion + ", Valoración: " + valoracion + "€.");
        if (casa != null) casa.mostrarDatos();
    }

    public class Casa {
        private double metros;
        private boolean piscina;
        private int habitaciones;

        public Casa(double metros) {
            this.metros = metros;
            this.piscina = false;
            this.habitaciones = 0;
        }

        public void construirHabitacion(double metrosHabitacion) throws Exception {
            if (metrosHabitacion > metros) {
                throw new Exception(" No se puede construir la habitación. Espacio insuficiente.");
            }
            habitaciones++;
            metros -= metrosHabitacion;
            System.out.println(" Habitación construida. Espacio restante: " + metros + "m².");
        }

        public void construirPiscina() throws Exception {
            if (piscina) {
                throw new Exception(" Ya hay una piscina en el terreno.");
            }
            piscina = true;
            System.out.println(" Piscina construida.");
        }

        public void construirAnexo(double metrosAnexo) throws Exception {
            if (metrosAnexo > metros) {
                throw new Exception(" No se puede construir el anexo. Espacio insuficiente.");
            }
            metros -= metrosAnexo;
            System.out.println(" Anexo construido. Espacio restante: " + metros + "m².");
        }

        public void mostrarDatos() {
            System.out.println(" Casa: " + metros + "m² restantes, " + habitaciones + " habitaciones, Piscina: " + (piscina ? "Sí" : "No"));
        }
    }
}