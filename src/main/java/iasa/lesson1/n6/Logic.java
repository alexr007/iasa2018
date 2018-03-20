package iasa.lesson1.n6;

public class Logic {
    final Input in;
    final Output out;
    final Process prc;

    public Logic(Input in, Output out, Process prc) {
        this.in = in;
        this.out = out;
        this.prc = prc;
    }

    public void run() {
        while (in.has()) {
            out.put(prc.process(in.get()));
        }
        out.done();
    }
}
