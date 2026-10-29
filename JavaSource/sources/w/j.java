package w;

/* compiled from: MyApplication */
class j extends p {
    public j(v.e eVar) {
        super(eVar);
        eVar.f26629e.f();
        eVar.f26631f.f();
        this.f27003f = ((v.g) eVar).o1();
    }

    private void q(f fVar) {
        this.f27005h.f26955k.add(fVar);
        fVar.f26956l.add(this.f27005h);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        f fVar = this.f27005h;
        if (fVar.f26947c && !fVar.f26954j) {
            this.f27005h.d((int) ((((f) fVar.f26956l.get(0)).f26951g * ((v.g) this.f26999b).r1()) + 0.5f));
        }
    }

    @Override // w.p
    void d() {
        v.g gVar = (v.g) this.f26999b;
        int p12 = gVar.p1();
        int q12 = gVar.q1();
        gVar.r1();
        if (gVar.o1() == 1) {
            if (p12 != -1) {
                this.f27005h.f26956l.add(this.f26999b.f26622a0.f26629e.f27005h);
                this.f26999b.f26622a0.f26629e.f27005h.f26955k.add(this.f27005h);
                this.f27005h.f26950f = p12;
            } else if (q12 != -1) {
                this.f27005h.f26956l.add(this.f26999b.f26622a0.f26629e.f27006i);
                this.f26999b.f26622a0.f26629e.f27006i.f26955k.add(this.f27005h);
                this.f27005h.f26950f = -q12;
            } else {
                f fVar = this.f27005h;
                fVar.f26946b = true;
                fVar.f26956l.add(this.f26999b.f26622a0.f26629e.f27006i);
                this.f26999b.f26622a0.f26629e.f27006i.f26955k.add(this.f27005h);
            }
            q(this.f26999b.f26629e.f27005h);
            q(this.f26999b.f26629e.f27006i);
            return;
        }
        if (p12 != -1) {
            this.f27005h.f26956l.add(this.f26999b.f26622a0.f26631f.f27005h);
            this.f26999b.f26622a0.f26631f.f27005h.f26955k.add(this.f27005h);
            this.f27005h.f26950f = p12;
        } else if (q12 != -1) {
            this.f27005h.f26956l.add(this.f26999b.f26622a0.f26631f.f27006i);
            this.f26999b.f26622a0.f26631f.f27006i.f26955k.add(this.f27005h);
            this.f27005h.f26950f = -q12;
        } else {
            f fVar2 = this.f27005h;
            fVar2.f26946b = true;
            fVar2.f26956l.add(this.f26999b.f26622a0.f26631f.f27006i);
            this.f26999b.f26622a0.f26631f.f27006i.f26955k.add(this.f27005h);
        }
        q(this.f26999b.f26631f.f27005h);
        q(this.f26999b.f26631f.f27006i);
    }

    @Override // w.p
    public void e() {
        if (((v.g) this.f26999b).o1() == 1) {
            this.f26999b.i1(this.f27005h.f26951g);
        } else {
            this.f26999b.j1(this.f27005h.f26951g);
        }
    }

    @Override // w.p
    void f() {
        this.f27005h.c();
    }

    @Override // w.p
    boolean m() {
        return false;
    }
}
