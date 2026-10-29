package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f24678a;

    /* renamed from: b, reason: collision with root package name */
    private final u0.a f24679b;

    /* compiled from: MyApplication */
    class a extends u0.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // u0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, m1.a aVar) {
            String str = aVar.f24676a;
            if (str == null) {
                fVar.p0(1);
            } else {
                fVar.E(1, str);
            }
            String str2 = aVar.f24677b;
            if (str2 == null) {
                fVar.p0(2);
            } else {
                fVar.E(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f24678a = hVar;
        this.f24679b = new a(hVar);
    }

    @Override // m1.b
    public List a(String str) {
        u0.c e8 = u0.c.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24678a.b();
        Cursor b8 = w0.c.b(this.f24678a, e8, false, null);
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

    @Override // m1.b
    public boolean b(String str) {
        u0.c e8 = u0.c.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24678a.b();
        boolean z7 = false;
        Cursor b8 = w0.c.b(this.f24678a, e8, false, null);
        try {
            if (b8.moveToFirst()) {
                z7 = b8.getInt(0) != 0;
            }
            return z7;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.b
    public void c(m1.a aVar) {
        this.f24678a.b();
        this.f24678a.c();
        try {
            this.f24679b.h(aVar);
            this.f24678a.r();
        } finally {
            this.f24678a.g();
        }
    }

    @Override // m1.b
    public boolean d(String str) {
        u0.c e8 = u0.c.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24678a.b();
        boolean z7 = false;
        Cursor b8 = w0.c.b(this.f24678a, e8, false, null);
        try {
            if (b8.moveToFirst()) {
                z7 = b8.getInt(0) != 0;
            }
            return z7;
        } finally {
            b8.close();
            e8.j();
        }
    }
}
