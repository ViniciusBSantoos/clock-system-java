public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    // SOBRESCREVE validação de hora
    @Override
    public void setHora(int hora) {
        if (hora >= 1 && hora <= 12) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida para formato americano!");
        }
    }

    @Override
    public void converterHorario(Relogio outroRelogio) {

        int horaConvertida = outroRelogio.getHora();

        // CONVERSÃO 24h -> 12h
        if (horaConvertida > 12) {
            horaConvertida = horaConvertida - 12;
        }

        if (horaConvertida == 0) {
            horaConvertida = 12;
        }

        setHora(horaConvertida);
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());

        System.out.println("Horário convertido para formato americano!");
    }
}