public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void converterHorario(Relogio outroRelogio) {

        int horaConvertida = outroRelogio.getHora();

        // Se vier de formato americano (ex: 1 a 12),
        // aqui você poderia tratar (simples por enquanto)
        
        setHora(horaConvertida);
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());

        System.out.println("Horário convertido para formato brasileiro!");
    }
}