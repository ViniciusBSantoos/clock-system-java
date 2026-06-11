public abstract class Relogio {

    protected int hora;
    protected int minuto;
    protected int segundo;

    // CONSTRUTOR
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // GETTERS
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // SETTERS com validação (regras de relógio)
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida!");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido!");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido!");
        }
    }

    // FORMATO HH:MM:SS
    public String getHorario() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // MÉTODO ABSTRATO (cada tipo de relógio decide como usar)
    public abstract void converterHorario(Relogio outroRelogio);
}