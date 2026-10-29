package m1;

/* compiled from: MyApplication */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f24700a;

    /* renamed from: b, reason: collision with root package name */
    private final u0.a f24701b;

    /* renamed from: c, reason: collision with root package name */
    private final u0.d f24702c;

    /* renamed from: d, reason: collision with root package name */
    private final u0.d f24703d;

    /* compiled from: MyApplication */
    class a extends u0.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // u0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, m mVar) {
            String str = mVar.f24698a;
            if (str == null) {
                fVar.p0(1);
            } else {
                fVar.E(1, str);
            }
            byte[] k7 = androidx.work.b.k(mVar.f24699b);
            if (k7 == null) {
                fVar.p0(2);
            } else {
                fVar.Z(2, k7);
            }
        }
    }

    /* compiled from: MyApplication */
    class b extends u0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: MyApplication */
    class c extends u0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f24700a = hVar;
        this.f24701b = new a(hVar);
        this.f24702c = new b(hVar);
        this.f24703d = new c(hVar);
    }

    @Override // m1.n
    public void a(String str) {
        this.f24700a.b();
        x0.f a8 = this.f24702c.a();
        if (str == null) {
            a8.p0(1);
        } else {
            a8.E(1, str);
        }
        this.f24700a.c();
        try {
            a8.J();
            this.f24700a.r();
        } finally {
            this.f24700a.g();
            this.f24702c.f(a8);
        }
    }

    @Override // m1.n
    public void b(m mVar) {
        this.f24700a.b();
        this.f24700a.c();
        try {
            this.f24701b.h(mVar);
            this.f24700a.r();
        } finally {
            this.f24700a.g();
        }
    }

    @Override // m1.n
    public void c() {
        this.f24700a.b();
        x0.f a8 = this.f24703d.a();
        this.f24700a.c();
        try {
            a8.J();
            this.f24700a.r();
        } finally {
            this.f24700a.g();
            this.f24703d.f(a8);
        }
    }
}
