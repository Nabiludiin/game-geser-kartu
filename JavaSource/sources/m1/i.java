package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f24688a;

    /* renamed from: b, reason: collision with root package name */
    private final u0.a f24689b;

    /* renamed from: c, reason: collision with root package name */
    private final u0.d f24690c;

    /* compiled from: MyApplication */
    class a extends u0.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // u0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, g gVar) {
            String str = gVar.f24686a;
            if (str == null) {
                fVar.p0(1);
            } else {
                fVar.E(1, str);
            }
            fVar.W(2, gVar.f24687b);
        }
    }

    /* compiled from: MyApplication */
    class b extends u0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f24688a = hVar;
        this.f24689b = new a(hVar);
        this.f24690c = new b(hVar);
    }

    @Override // m1.h
    public List a() {
        u0.c e8 = u0.c.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f24688a.b();
        Cursor b8 = w0.c.b(this.f24688a, e8, false, null);
        try {
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                arrayList.add(b8.getString(0));
            }
            return arrayList;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.h
    public g b(String str) {
        u0.c e8 = u0.c.e("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24688a.b();
        Cursor b8 = w0.c.b(this.f24688a, e8, false, null);
        try {
            return b8.moveToFirst() ? new g(b8.getString(w0.b.b(b8, "work_spec_id")), b8.getInt(w0.b.b(b8, "system_id"))) : null;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.h
    public void c(String str) {
        this.f24688a.b();
        x0.f a8 = this.f24690c.a();
        if (str == null) {
            a8.p0(1);
        } else {
            a8.E(1, str);
        }
        this.f24688a.c();
        try {
            a8.J();
            this.f24688a.r();
        } finally {
            this.f24688a.g();
            this.f24690c.f(a8);
        }
    }

    @Override // m1.h
    public void d(g gVar) {
        this.f24688a.b();
        this.f24688a.c();
        try {
            this.f24689b.h(gVar);
            this.f24688a.r();
        } finally {
            this.f24688a.g();
        }
    }
}
