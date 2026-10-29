package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f24695a;

    /* renamed from: b, reason: collision with root package name */
    private final u0.a f24696b;

    /* compiled from: MyApplication */
    class a extends u0.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // u0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, j jVar) {
            String str = jVar.f24693a;
            if (str == null) {
                fVar.p0(1);
            } else {
                fVar.E(1, str);
            }
            String str2 = jVar.f24694b;
            if (str2 == null) {
                fVar.p0(2);
            } else {
                fVar.E(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f24695a = hVar;
        this.f24696b = new a(hVar);
    }

    @Override // m1.k
    public void a(j jVar) {
        this.f24695a.b();
        this.f24695a.c();
        try {
            this.f24696b.h(jVar);
            this.f24695a.r();
        } finally {
            this.f24695a.g();
        }
    }

    @Override // m1.k
    public List b(String str) {
        u0.c e8 = u0.c.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24695a.b();
        Cursor b8 = w0.c.b(this.f24695a, e8, false, null);
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
}
