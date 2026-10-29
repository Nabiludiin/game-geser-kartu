package m1;

import android.database.Cursor;

/* compiled from: MyApplication */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f24683a;

    /* renamed from: b, reason: collision with root package name */
    private final u0.a f24684b;

    /* compiled from: MyApplication */
    class a extends u0.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // u0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, d dVar) {
            String str = dVar.f24681a;
            if (str == null) {
                fVar.p0(1);
            } else {
                fVar.E(1, str);
            }
            Long l7 = dVar.f24682b;
            if (l7 == null) {
                fVar.p0(2);
            } else {
                fVar.W(2, l7.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f24683a = hVar;
        this.f24684b = new a(hVar);
    }

    @Override // m1.e
    public Long a(String str) {
        u0.c e8 = u0.c.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24683a.b();
        Long l7 = null;
        Cursor b8 = w0.c.b(this.f24683a, e8, false, null);
        try {
            if (b8.moveToFirst() && !b8.isNull(0)) {
                l7 = Long.valueOf(b8.getLong(0));
            }
            return l7;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.e
    public void b(d dVar) {
        this.f24683a.b();
        this.f24683a.c();
        try {
            this.f24684b.h(dVar);
            this.f24683a.r();
        } finally {
            this.f24683a.g();
        }
    }
}
