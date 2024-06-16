package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " é no dia " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 14), "Evento 1", "Matuê");
        eventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 28), "Evento 2", "Diogo Defante");
        eventos.adicionarEvento(LocalDate.of(2024, 12, 21), "Evento 3", "Jovem Dionisio");

        eventos.exibirAgenda();

        eventos.obterProximoEvento();
    }
}
