public class BankKonto {
    private int balanse;

    public void innskudd(int amount) {
        balanse += amount;
    }

    public void uttak(int amount) {
        if (balanse >= amount) {
            balanse -= amount;
        }
    }

    public int getBalanse() {
        return balanse;
    }
}

// I dette eksempelet har klassen "BankKonto" en privat variabel "balanse" og
// tre offentlige metoder "innskudd", "uttak" og "getBalanse". Variabelen
// "balanse" kan bare leses og endres gjennom disse offentlige metodene. Dette
// bidrar til å hindre uønskede endringer i balansen som kan oppstå hvis
// variabelen var offentlig og tilgjengelig fra andre deler av programmet.

// I dette eksempelet skjuler klassen "BankAccount" balansen til kontoen og
// eksponerer bare tre offentlige metoder for å gjøre innskudd, ta ut penger og
// hente saldoen. Dette sikrer at balansen ikke kan endres direkte og må følge
// de begrensningene som er satt av metoder for innskudd og uttak.
