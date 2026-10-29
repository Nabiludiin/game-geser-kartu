package v1;

import java.util.LinkedList;

public class a {

    private LinkedList f26700a = new LinkedList();

    private InterfaceC0137a f26701b;


    public interface InterfaceC0137a {
        void a(Object obj);

        void b(Object obj);
    }

    public a(InterfaceC0137a interfaceC0137a) {
        this.f26701b = interfaceC0137a;
    }

    private void b(com.nabil.swipedeck.a aVar) {
        this.f26700a.addLast(aVar);
        j();
        this.f26701b.a(aVar);
    }

    private com.nabil.swipedeck.a e() {
        if (this.f26700a.size() > 0) {
            return (com.nabil.swipedeck.a) this.f26700a.getFirst();
        }
        return null;
    }

    private com.nabil.swipedeck.a g() {
        com.nabil.swipedeck.a aVar = (com.nabil.swipedeck.a) this.f26700a.removeFirst();
        j();
        this.f26701b.b(aVar);
        return aVar;
    }

    private void j() {
        for (int i7 = 0; i7 < this.f26700a.size(); i7++) {
            ((com.nabil.swipedeck.a) this.f26700a.get(i7)).k(i7);
        }
    }

    public void a(com.nabil.swipedeck.a aVar) {
        b(aVar);
    }

    public void c() {
        while (i() > 0) {
            g();
        }
    }

    public com.nabil.swipedeck.a d(int i7) {
        return (com.nabil.swipedeck.a) this.f26700a.get(i7);
    }

    public com.nabil.swipedeck.a f() {
        return e();
    }

    public void h() {
        g();
    }

    public int i() {
        return this.f26700a.size();
    }
}
