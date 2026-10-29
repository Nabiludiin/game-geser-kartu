package m1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import m1.p;

/* compiled from: MyApplication */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f24729a;

    /* renamed from: b, reason: collision with root package name */
    private final u0.a f24730b;

    /* renamed from: c, reason: collision with root package name */
    private final u0.d f24731c;

    /* renamed from: d, reason: collision with root package name */
    private final u0.d f24732d;

    /* renamed from: e, reason: collision with root package name */
    private final u0.d f24733e;

    /* renamed from: f, reason: collision with root package name */
    private final u0.d f24734f;

    /* renamed from: g, reason: collision with root package name */
    private final u0.d f24735g;

    /* renamed from: h, reason: collision with root package name */
    private final u0.d f24736h;

    /* renamed from: i, reason: collision with root package name */
    private final u0.d f24737i;

    /* renamed from: j, reason: collision with root package name */
    private final u0.d f24738j;

    /* compiled from: MyApplication */
    class a extends u0.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // u0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, p pVar) {
            String str = pVar.f24709a;
            if (str == null) {
                fVar.p0(1);
            } else {
                fVar.E(1, str);
            }
            fVar.W(2, v.j(pVar.f24710b));
            String str2 = pVar.f24711c;
            if (str2 == null) {
                fVar.p0(3);
            } else {
                fVar.E(3, str2);
            }
            String str3 = pVar.f24712d;
            if (str3 == null) {
                fVar.p0(4);
            } else {
                fVar.E(4, str3);
            }
            byte[] k7 = androidx.work.b.k(pVar.f24713e);
            if (k7 == null) {
                fVar.p0(5);
            } else {
                fVar.Z(5, k7);
            }
            byte[] k8 = androidx.work.b.k(pVar.f24714f);
            if (k8 == null) {
                fVar.p0(6);
            } else {
                fVar.Z(6, k8);
            }
            fVar.W(7, pVar.f24715g);
            fVar.W(8, pVar.f24716h);
            fVar.W(9, pVar.f24717i);
            fVar.W(10, pVar.f24719k);
            fVar.W(11, v.a(pVar.f24720l));
            fVar.W(12, pVar.f24721m);
            fVar.W(13, pVar.f24722n);
            fVar.W(14, pVar.f24723o);
            fVar.W(15, pVar.f24724p);
            fVar.W(16, pVar.f24725q ? 1L : 0L);
            fVar.W(17, v.i(pVar.f24726r));
            e1.b bVar = pVar.f24718j;
            if (bVar == null) {
                fVar.p0(18);
                fVar.p0(19);
                fVar.p0(20);
                fVar.p0(21);
                fVar.p0(22);
                fVar.p0(23);
                fVar.p0(24);
                fVar.p0(25);
                return;
            }
            fVar.W(18, v.h(bVar.b()));
            fVar.W(19, bVar.g() ? 1L : 0L);
            fVar.W(20, bVar.h() ? 1L : 0L);
            fVar.W(21, bVar.f() ? 1L : 0L);
            fVar.W(22, bVar.i() ? 1L : 0L);
            fVar.W(23, bVar.c());
            fVar.W(24, bVar.d());
            byte[] c8 = v.c(bVar.a());
            if (c8 == null) {
                fVar.p0(25);
            } else {
                fVar.Z(25, c8);
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
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: MyApplication */
    class c extends u0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: MyApplication */
    class d extends u0.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: MyApplication */
    class e extends u0.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: MyApplication */
    class f extends u0.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: MyApplication */
    class g extends u0.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: MyApplication */
    class h extends u0.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: MyApplication */
    class i extends u0.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // u0.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f24729a = hVar;
        this.f24730b = new a(hVar);
        this.f24731c = new b(hVar);
        this.f24732d = new c(hVar);
        this.f24733e = new d(hVar);
        this.f24734f = new e(hVar);
        this.f24735g = new f(hVar);
        this.f24736h = new g(hVar);
        this.f24737i = new h(hVar);
        this.f24738j = new i(hVar);
    }

    @Override // m1.q
    public void a(String str) {
        this.f24729a.b();
        x0.f a8 = this.f24731c.a();
        if (str == null) {
            a8.p0(1);
        } else {
            a8.E(1, str);
        }
        this.f24729a.c();
        try {
            a8.J();
            this.f24729a.r();
        } finally {
            this.f24729a.g();
            this.f24731c.f(a8);
        }
    }

    @Override // m1.q
    public int b(String str, long j7) {
        this.f24729a.b();
        x0.f a8 = this.f24736h.a();
        a8.W(1, j7);
        if (str == null) {
            a8.p0(2);
        } else {
            a8.E(2, str);
        }
        this.f24729a.c();
        try {
            int J = a8.J();
            this.f24729a.r();
            return J;
        } finally {
            this.f24729a.g();
            this.f24736h.f(a8);
        }
    }

    @Override // m1.q
    public void c(p pVar) {
        this.f24729a.b();
        this.f24729a.c();
        try {
            this.f24730b.h(pVar);
            this.f24729a.r();
        } finally {
            this.f24729a.g();
        }
    }

    @Override // m1.q
    public List d(String str) {
        u0.c e8 = u0.c.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            int b9 = w0.b.b(b8, "id");
            int b10 = w0.b.b(b8, "state");
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f24727a = b8.getString(b9);
                bVar.f24728b = v.g(b8.getInt(b10));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.q
    public List e(long j7) {
        u0.c cVar;
        u0.c e8 = u0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        e8.W(1, j7);
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            int b9 = w0.b.b(b8, "required_network_type");
            int b10 = w0.b.b(b8, "requires_charging");
            int b11 = w0.b.b(b8, "requires_device_idle");
            int b12 = w0.b.b(b8, "requires_battery_not_low");
            int b13 = w0.b.b(b8, "requires_storage_not_low");
            int b14 = w0.b.b(b8, "trigger_content_update_delay");
            int b15 = w0.b.b(b8, "trigger_max_content_delay");
            int b16 = w0.b.b(b8, "content_uri_triggers");
            int b17 = w0.b.b(b8, "id");
            int b18 = w0.b.b(b8, "state");
            int b19 = w0.b.b(b8, "worker_class_name");
            int b20 = w0.b.b(b8, "input_merger_class_name");
            int b21 = w0.b.b(b8, "input");
            int b22 = w0.b.b(b8, "output");
            cVar = e8;
            try {
                int b23 = w0.b.b(b8, "initial_delay");
                int b24 = w0.b.b(b8, "interval_duration");
                int b25 = w0.b.b(b8, "flex_duration");
                int b26 = w0.b.b(b8, "run_attempt_count");
                int b27 = w0.b.b(b8, "backoff_policy");
                int b28 = w0.b.b(b8, "backoff_delay_duration");
                int b29 = w0.b.b(b8, "period_start_time");
                int b30 = w0.b.b(b8, "minimum_retention_duration");
                int b31 = w0.b.b(b8, "schedule_requested_at");
                int b32 = w0.b.b(b8, "run_in_foreground");
                int b33 = w0.b.b(b8, "out_of_quota_policy");
                int i7 = b22;
                ArrayList arrayList = new ArrayList(b8.getCount());
                while (b8.moveToNext()) {
                    String string = b8.getString(b17);
                    int i8 = b17;
                    String string2 = b8.getString(b19);
                    int i9 = b19;
                    e1.b bVar = new e1.b();
                    int i10 = b9;
                    bVar.k(v.e(b8.getInt(b9)));
                    bVar.m(b8.getInt(b10) != 0);
                    bVar.n(b8.getInt(b11) != 0);
                    bVar.l(b8.getInt(b12) != 0);
                    bVar.o(b8.getInt(b13) != 0);
                    int i11 = b10;
                    int i12 = b11;
                    bVar.p(b8.getLong(b14));
                    bVar.q(b8.getLong(b15));
                    bVar.j(v.b(b8.getBlob(b16)));
                    p pVar = new p(string, string2);
                    pVar.f24710b = v.g(b8.getInt(b18));
                    pVar.f24712d = b8.getString(b20);
                    pVar.f24713e = androidx.work.b.g(b8.getBlob(b21));
                    int i13 = i7;
                    pVar.f24714f = androidx.work.b.g(b8.getBlob(i13));
                    int i14 = b23;
                    i7 = i13;
                    pVar.f24715g = b8.getLong(i14);
                    int i15 = b20;
                    int i16 = b24;
                    pVar.f24716h = b8.getLong(i16);
                    int i17 = b12;
                    int i18 = b25;
                    pVar.f24717i = b8.getLong(i18);
                    int i19 = b26;
                    pVar.f24719k = b8.getInt(i19);
                    int i20 = b27;
                    pVar.f24720l = v.d(b8.getInt(i20));
                    b25 = i18;
                    int i21 = b28;
                    pVar.f24721m = b8.getLong(i21);
                    int i22 = b29;
                    pVar.f24722n = b8.getLong(i22);
                    b29 = i22;
                    int i23 = b30;
                    pVar.f24723o = b8.getLong(i23);
                    int i24 = b31;
                    pVar.f24724p = b8.getLong(i24);
                    int i25 = b32;
                    pVar.f24725q = b8.getInt(i25) != 0;
                    int i26 = b33;
                    pVar.f24726r = v.f(b8.getInt(i26));
                    pVar.f24718j = bVar;
                    arrayList.add(pVar);
                    b28 = i21;
                    b12 = i17;
                    b27 = i20;
                    b10 = i11;
                    b33 = i26;
                    b20 = i15;
                    b23 = i14;
                    b24 = i16;
                    b26 = i19;
                    b31 = i24;
                    b17 = i8;
                    b19 = i9;
                    b9 = i10;
                    b32 = i25;
                    b30 = i23;
                    b11 = i12;
                }
                b8.close();
                cVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b8.close();
                cVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = e8;
        }
    }

    @Override // m1.q
    public List f(int i7) {
        u0.c cVar;
        u0.c e8 = u0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e8.W(1, i7);
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            int b9 = w0.b.b(b8, "required_network_type");
            int b10 = w0.b.b(b8, "requires_charging");
            int b11 = w0.b.b(b8, "requires_device_idle");
            int b12 = w0.b.b(b8, "requires_battery_not_low");
            int b13 = w0.b.b(b8, "requires_storage_not_low");
            int b14 = w0.b.b(b8, "trigger_content_update_delay");
            int b15 = w0.b.b(b8, "trigger_max_content_delay");
            int b16 = w0.b.b(b8, "content_uri_triggers");
            int b17 = w0.b.b(b8, "id");
            int b18 = w0.b.b(b8, "state");
            int b19 = w0.b.b(b8, "worker_class_name");
            int b20 = w0.b.b(b8, "input_merger_class_name");
            int b21 = w0.b.b(b8, "input");
            int b22 = w0.b.b(b8, "output");
            cVar = e8;
            try {
                int b23 = w0.b.b(b8, "initial_delay");
                int b24 = w0.b.b(b8, "interval_duration");
                int b25 = w0.b.b(b8, "flex_duration");
                int b26 = w0.b.b(b8, "run_attempt_count");
                int b27 = w0.b.b(b8, "backoff_policy");
                int b28 = w0.b.b(b8, "backoff_delay_duration");
                int b29 = w0.b.b(b8, "period_start_time");
                int b30 = w0.b.b(b8, "minimum_retention_duration");
                int b31 = w0.b.b(b8, "schedule_requested_at");
                int b32 = w0.b.b(b8, "run_in_foreground");
                int b33 = w0.b.b(b8, "out_of_quota_policy");
                int i8 = b22;
                ArrayList arrayList = new ArrayList(b8.getCount());
                while (b8.moveToNext()) {
                    String string = b8.getString(b17);
                    int i9 = b17;
                    String string2 = b8.getString(b19);
                    int i10 = b19;
                    e1.b bVar = new e1.b();
                    int i11 = b9;
                    bVar.k(v.e(b8.getInt(b9)));
                    bVar.m(b8.getInt(b10) != 0);
                    bVar.n(b8.getInt(b11) != 0);
                    bVar.l(b8.getInt(b12) != 0);
                    bVar.o(b8.getInt(b13) != 0);
                    int i12 = b10;
                    int i13 = b11;
                    bVar.p(b8.getLong(b14));
                    bVar.q(b8.getLong(b15));
                    bVar.j(v.b(b8.getBlob(b16)));
                    p pVar = new p(string, string2);
                    pVar.f24710b = v.g(b8.getInt(b18));
                    pVar.f24712d = b8.getString(b20);
                    pVar.f24713e = androidx.work.b.g(b8.getBlob(b21));
                    int i14 = i8;
                    pVar.f24714f = androidx.work.b.g(b8.getBlob(i14));
                    i8 = i14;
                    int i15 = b23;
                    pVar.f24715g = b8.getLong(i15);
                    int i16 = b20;
                    int i17 = b24;
                    pVar.f24716h = b8.getLong(i17);
                    int i18 = b12;
                    int i19 = b25;
                    pVar.f24717i = b8.getLong(i19);
                    int i20 = b26;
                    pVar.f24719k = b8.getInt(i20);
                    int i21 = b27;
                    pVar.f24720l = v.d(b8.getInt(i21));
                    b25 = i19;
                    int i22 = b28;
                    pVar.f24721m = b8.getLong(i22);
                    int i23 = b29;
                    pVar.f24722n = b8.getLong(i23);
                    b29 = i23;
                    int i24 = b30;
                    pVar.f24723o = b8.getLong(i24);
                    int i25 = b31;
                    pVar.f24724p = b8.getLong(i25);
                    int i26 = b32;
                    pVar.f24725q = b8.getInt(i26) != 0;
                    int i27 = b33;
                    pVar.f24726r = v.f(b8.getInt(i27));
                    pVar.f24718j = bVar;
                    arrayList.add(pVar);
                    b28 = i22;
                    b12 = i18;
                    b27 = i21;
                    b33 = i27;
                    b10 = i12;
                    b20 = i16;
                    b23 = i15;
                    b24 = i17;
                    b26 = i20;
                    b31 = i25;
                    b17 = i9;
                    b19 = i10;
                    b9 = i11;
                    b32 = i26;
                    b30 = i24;
                    b11 = i13;
                }
                b8.close();
                cVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b8.close();
                cVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = e8;
        }
    }

    @Override // m1.q
    public List g() {
        u0.c cVar;
        u0.c e8 = u0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            int b9 = w0.b.b(b8, "required_network_type");
            int b10 = w0.b.b(b8, "requires_charging");
            int b11 = w0.b.b(b8, "requires_device_idle");
            int b12 = w0.b.b(b8, "requires_battery_not_low");
            int b13 = w0.b.b(b8, "requires_storage_not_low");
            int b14 = w0.b.b(b8, "trigger_content_update_delay");
            int b15 = w0.b.b(b8, "trigger_max_content_delay");
            int b16 = w0.b.b(b8, "content_uri_triggers");
            int b17 = w0.b.b(b8, "id");
            int b18 = w0.b.b(b8, "state");
            int b19 = w0.b.b(b8, "worker_class_name");
            int b20 = w0.b.b(b8, "input_merger_class_name");
            int b21 = w0.b.b(b8, "input");
            int b22 = w0.b.b(b8, "output");
            cVar = e8;
            try {
                int b23 = w0.b.b(b8, "initial_delay");
                int b24 = w0.b.b(b8, "interval_duration");
                int b25 = w0.b.b(b8, "flex_duration");
                int b26 = w0.b.b(b8, "run_attempt_count");
                int b27 = w0.b.b(b8, "backoff_policy");
                int b28 = w0.b.b(b8, "backoff_delay_duration");
                int b29 = w0.b.b(b8, "period_start_time");
                int b30 = w0.b.b(b8, "minimum_retention_duration");
                int b31 = w0.b.b(b8, "schedule_requested_at");
                int b32 = w0.b.b(b8, "run_in_foreground");
                int b33 = w0.b.b(b8, "out_of_quota_policy");
                int i7 = b22;
                ArrayList arrayList = new ArrayList(b8.getCount());
                while (b8.moveToNext()) {
                    String string = b8.getString(b17);
                    int i8 = b17;
                    String string2 = b8.getString(b19);
                    int i9 = b19;
                    e1.b bVar = new e1.b();
                    int i10 = b9;
                    bVar.k(v.e(b8.getInt(b9)));
                    bVar.m(b8.getInt(b10) != 0);
                    bVar.n(b8.getInt(b11) != 0);
                    bVar.l(b8.getInt(b12) != 0);
                    bVar.o(b8.getInt(b13) != 0);
                    int i11 = b10;
                    int i12 = b11;
                    bVar.p(b8.getLong(b14));
                    bVar.q(b8.getLong(b15));
                    bVar.j(v.b(b8.getBlob(b16)));
                    p pVar = new p(string, string2);
                    pVar.f24710b = v.g(b8.getInt(b18));
                    pVar.f24712d = b8.getString(b20);
                    pVar.f24713e = androidx.work.b.g(b8.getBlob(b21));
                    int i13 = i7;
                    pVar.f24714f = androidx.work.b.g(b8.getBlob(i13));
                    i7 = i13;
                    int i14 = b23;
                    pVar.f24715g = b8.getLong(i14);
                    int i15 = b21;
                    int i16 = b24;
                    pVar.f24716h = b8.getLong(i16);
                    int i17 = b12;
                    int i18 = b25;
                    pVar.f24717i = b8.getLong(i18);
                    int i19 = b26;
                    pVar.f24719k = b8.getInt(i19);
                    int i20 = b27;
                    pVar.f24720l = v.d(b8.getInt(i20));
                    b25 = i18;
                    int i21 = b28;
                    pVar.f24721m = b8.getLong(i21);
                    int i22 = b29;
                    pVar.f24722n = b8.getLong(i22);
                    b29 = i22;
                    int i23 = b30;
                    pVar.f24723o = b8.getLong(i23);
                    int i24 = b31;
                    pVar.f24724p = b8.getLong(i24);
                    int i25 = b32;
                    pVar.f24725q = b8.getInt(i25) != 0;
                    int i26 = b33;
                    pVar.f24726r = v.f(b8.getInt(i26));
                    pVar.f24718j = bVar;
                    arrayList.add(pVar);
                    b28 = i21;
                    b12 = i17;
                    b27 = i20;
                    b33 = i26;
                    b10 = i11;
                    b21 = i15;
                    b23 = i14;
                    b24 = i16;
                    b26 = i19;
                    b31 = i24;
                    b17 = i8;
                    b19 = i9;
                    b9 = i10;
                    b32 = i25;
                    b30 = i23;
                    b11 = i12;
                }
                b8.close();
                cVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b8.close();
                cVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = e8;
        }
    }

    @Override // m1.q
    public void h(String str, androidx.work.b bVar) {
        this.f24729a.b();
        x0.f a8 = this.f24732d.a();
        byte[] k7 = androidx.work.b.k(bVar);
        if (k7 == null) {
            a8.p0(1);
        } else {
            a8.Z(1, k7);
        }
        if (str == null) {
            a8.p0(2);
        } else {
            a8.E(2, str);
        }
        this.f24729a.c();
        try {
            a8.J();
            this.f24729a.r();
        } finally {
            this.f24729a.g();
            this.f24732d.f(a8);
        }
    }

    @Override // m1.q
    public List i() {
        u0.c cVar;
        u0.c e8 = u0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            int b9 = w0.b.b(b8, "required_network_type");
            int b10 = w0.b.b(b8, "requires_charging");
            int b11 = w0.b.b(b8, "requires_device_idle");
            int b12 = w0.b.b(b8, "requires_battery_not_low");
            int b13 = w0.b.b(b8, "requires_storage_not_low");
            int b14 = w0.b.b(b8, "trigger_content_update_delay");
            int b15 = w0.b.b(b8, "trigger_max_content_delay");
            int b16 = w0.b.b(b8, "content_uri_triggers");
            int b17 = w0.b.b(b8, "id");
            int b18 = w0.b.b(b8, "state");
            int b19 = w0.b.b(b8, "worker_class_name");
            int b20 = w0.b.b(b8, "input_merger_class_name");
            int b21 = w0.b.b(b8, "input");
            int b22 = w0.b.b(b8, "output");
            cVar = e8;
            try {
                int b23 = w0.b.b(b8, "initial_delay");
                int b24 = w0.b.b(b8, "interval_duration");
                int b25 = w0.b.b(b8, "flex_duration");
                int b26 = w0.b.b(b8, "run_attempt_count");
                int b27 = w0.b.b(b8, "backoff_policy");
                int b28 = w0.b.b(b8, "backoff_delay_duration");
                int b29 = w0.b.b(b8, "period_start_time");
                int b30 = w0.b.b(b8, "minimum_retention_duration");
                int b31 = w0.b.b(b8, "schedule_requested_at");
                int b32 = w0.b.b(b8, "run_in_foreground");
                int b33 = w0.b.b(b8, "out_of_quota_policy");
                int i7 = b22;
                ArrayList arrayList = new ArrayList(b8.getCount());
                while (b8.moveToNext()) {
                    String string = b8.getString(b17);
                    int i8 = b17;
                    String string2 = b8.getString(b19);
                    int i9 = b19;
                    e1.b bVar = new e1.b();
                    int i10 = b9;
                    bVar.k(v.e(b8.getInt(b9)));
                    bVar.m(b8.getInt(b10) != 0);
                    bVar.n(b8.getInt(b11) != 0);
                    bVar.l(b8.getInt(b12) != 0);
                    bVar.o(b8.getInt(b13) != 0);
                    int i11 = b10;
                    int i12 = b11;
                    bVar.p(b8.getLong(b14));
                    bVar.q(b8.getLong(b15));
                    bVar.j(v.b(b8.getBlob(b16)));
                    p pVar = new p(string, string2);
                    pVar.f24710b = v.g(b8.getInt(b18));
                    pVar.f24712d = b8.getString(b20);
                    pVar.f24713e = androidx.work.b.g(b8.getBlob(b21));
                    int i13 = i7;
                    pVar.f24714f = androidx.work.b.g(b8.getBlob(i13));
                    i7 = i13;
                    int i14 = b23;
                    pVar.f24715g = b8.getLong(i14);
                    int i15 = b21;
                    int i16 = b24;
                    pVar.f24716h = b8.getLong(i16);
                    int i17 = b12;
                    int i18 = b25;
                    pVar.f24717i = b8.getLong(i18);
                    int i19 = b26;
                    pVar.f24719k = b8.getInt(i19);
                    int i20 = b27;
                    pVar.f24720l = v.d(b8.getInt(i20));
                    b25 = i18;
                    int i21 = b28;
                    pVar.f24721m = b8.getLong(i21);
                    int i22 = b29;
                    pVar.f24722n = b8.getLong(i22);
                    b29 = i22;
                    int i23 = b30;
                    pVar.f24723o = b8.getLong(i23);
                    int i24 = b31;
                    pVar.f24724p = b8.getLong(i24);
                    int i25 = b32;
                    pVar.f24725q = b8.getInt(i25) != 0;
                    int i26 = b33;
                    pVar.f24726r = v.f(b8.getInt(i26));
                    pVar.f24718j = bVar;
                    arrayList.add(pVar);
                    b28 = i21;
                    b12 = i17;
                    b27 = i20;
                    b33 = i26;
                    b10 = i11;
                    b21 = i15;
                    b23 = i14;
                    b24 = i16;
                    b26 = i19;
                    b31 = i24;
                    b17 = i8;
                    b19 = i9;
                    b9 = i10;
                    b32 = i25;
                    b30 = i23;
                    b11 = i12;
                }
                b8.close();
                cVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b8.close();
                cVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = e8;
        }
    }

    @Override // m1.q
    public boolean j() {
        boolean z7 = false;
        u0.c e8 = u0.c.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            if (b8.moveToFirst()) {
                if (b8.getInt(0) != 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.q
    public List k(String str) {
        u0.c e8 = u0.c.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
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

    @Override // m1.q
    public e1.s l(String str) {
        u0.c e8 = u0.c.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            return b8.moveToFirst() ? v.g(b8.getInt(0)) : null;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.q
    public p m(String str) {
        u0.c cVar;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b20;
        int b21;
        p pVar;
        u0.c e8 = u0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24729a.b();
        Cursor b22 = w0.c.b(this.f24729a, e8, false, null);
        try {
            b8 = w0.b.b(b22, "required_network_type");
            b9 = w0.b.b(b22, "requires_charging");
            b10 = w0.b.b(b22, "requires_device_idle");
            b11 = w0.b.b(b22, "requires_battery_not_low");
            b12 = w0.b.b(b22, "requires_storage_not_low");
            b13 = w0.b.b(b22, "trigger_content_update_delay");
            b14 = w0.b.b(b22, "trigger_max_content_delay");
            b15 = w0.b.b(b22, "content_uri_triggers");
            b16 = w0.b.b(b22, "id");
            b17 = w0.b.b(b22, "state");
            b18 = w0.b.b(b22, "worker_class_name");
            b19 = w0.b.b(b22, "input_merger_class_name");
            b20 = w0.b.b(b22, "input");
            b21 = w0.b.b(b22, "output");
            cVar = e8;
        } catch (Throwable th) {
            th = th;
            cVar = e8;
        }
        try {
            int b23 = w0.b.b(b22, "initial_delay");
            int b24 = w0.b.b(b22, "interval_duration");
            int b25 = w0.b.b(b22, "flex_duration");
            int b26 = w0.b.b(b22, "run_attempt_count");
            int b27 = w0.b.b(b22, "backoff_policy");
            int b28 = w0.b.b(b22, "backoff_delay_duration");
            int b29 = w0.b.b(b22, "period_start_time");
            int b30 = w0.b.b(b22, "minimum_retention_duration");
            int b31 = w0.b.b(b22, "schedule_requested_at");
            int b32 = w0.b.b(b22, "run_in_foreground");
            int b33 = w0.b.b(b22, "out_of_quota_policy");
            if (b22.moveToFirst()) {
                String string = b22.getString(b16);
                String string2 = b22.getString(b18);
                e1.b bVar = new e1.b();
                bVar.k(v.e(b22.getInt(b8)));
                bVar.m(b22.getInt(b9) != 0);
                bVar.n(b22.getInt(b10) != 0);
                bVar.l(b22.getInt(b11) != 0);
                bVar.o(b22.getInt(b12) != 0);
                bVar.p(b22.getLong(b13));
                bVar.q(b22.getLong(b14));
                bVar.j(v.b(b22.getBlob(b15)));
                p pVar2 = new p(string, string2);
                pVar2.f24710b = v.g(b22.getInt(b17));
                pVar2.f24712d = b22.getString(b19);
                pVar2.f24713e = androidx.work.b.g(b22.getBlob(b20));
                pVar2.f24714f = androidx.work.b.g(b22.getBlob(b21));
                pVar2.f24715g = b22.getLong(b23);
                pVar2.f24716h = b22.getLong(b24);
                pVar2.f24717i = b22.getLong(b25);
                pVar2.f24719k = b22.getInt(b26);
                pVar2.f24720l = v.d(b22.getInt(b27));
                pVar2.f24721m = b22.getLong(b28);
                pVar2.f24722n = b22.getLong(b29);
                pVar2.f24723o = b22.getLong(b30);
                pVar2.f24724p = b22.getLong(b31);
                pVar2.f24725q = b22.getInt(b32) != 0;
                pVar2.f24726r = v.f(b22.getInt(b33));
                pVar2.f24718j = bVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            b22.close();
            cVar.j();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            b22.close();
            cVar.j();
            throw th;
        }
    }

    @Override // m1.q
    public int n(String str) {
        this.f24729a.b();
        x0.f a8 = this.f24735g.a();
        if (str == null) {
            a8.p0(1);
        } else {
            a8.E(1, str);
        }
        this.f24729a.c();
        try {
            int J = a8.J();
            this.f24729a.r();
            return J;
        } finally {
            this.f24729a.g();
            this.f24735g.f(a8);
        }
    }

    @Override // m1.q
    public int o(e1.s sVar, String... strArr) {
        this.f24729a.b();
        StringBuilder b8 = w0.e.b();
        b8.append("UPDATE workspec SET state=");
        b8.append("?");
        b8.append(" WHERE id IN (");
        w0.e.a(b8, strArr.length);
        b8.append(")");
        x0.f d8 = this.f24729a.d(b8.toString());
        d8.W(1, v.j(sVar));
        int i7 = 2;
        for (String str : strArr) {
            if (str == null) {
                d8.p0(i7);
            } else {
                d8.E(i7, str);
            }
            i7++;
        }
        this.f24729a.c();
        try {
            int J = d8.J();
            this.f24729a.r();
            return J;
        } finally {
            this.f24729a.g();
        }
    }

    @Override // m1.q
    public List p(String str) {
        u0.c e8 = u0.c.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
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

    @Override // m1.q
    public List q(String str) {
        u0.c e8 = u0.c.e("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            e8.p0(1);
        } else {
            e8.E(1, str);
        }
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                arrayList.add(androidx.work.b.g(b8.getBlob(0)));
            }
            return arrayList;
        } finally {
            b8.close();
            e8.j();
        }
    }

    @Override // m1.q
    public int r(String str) {
        this.f24729a.b();
        x0.f a8 = this.f24734f.a();
        if (str == null) {
            a8.p0(1);
        } else {
            a8.E(1, str);
        }
        this.f24729a.c();
        try {
            int J = a8.J();
            this.f24729a.r();
            return J;
        } finally {
            this.f24729a.g();
            this.f24734f.f(a8);
        }
    }

    @Override // m1.q
    public void s(String str, long j7) {
        this.f24729a.b();
        x0.f a8 = this.f24733e.a();
        a8.W(1, j7);
        if (str == null) {
            a8.p0(2);
        } else {
            a8.E(2, str);
        }
        this.f24729a.c();
        try {
            a8.J();
            this.f24729a.r();
        } finally {
            this.f24729a.g();
            this.f24733e.f(a8);
        }
    }

    @Override // m1.q
    public List t(int i7) {
        u0.c cVar;
        u0.c e8 = u0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        e8.W(1, i7);
        this.f24729a.b();
        Cursor b8 = w0.c.b(this.f24729a, e8, false, null);
        try {
            int b9 = w0.b.b(b8, "required_network_type");
            int b10 = w0.b.b(b8, "requires_charging");
            int b11 = w0.b.b(b8, "requires_device_idle");
            int b12 = w0.b.b(b8, "requires_battery_not_low");
            int b13 = w0.b.b(b8, "requires_storage_not_low");
            int b14 = w0.b.b(b8, "trigger_content_update_delay");
            int b15 = w0.b.b(b8, "trigger_max_content_delay");
            int b16 = w0.b.b(b8, "content_uri_triggers");
            int b17 = w0.b.b(b8, "id");
            int b18 = w0.b.b(b8, "state");
            int b19 = w0.b.b(b8, "worker_class_name");
            int b20 = w0.b.b(b8, "input_merger_class_name");
            int b21 = w0.b.b(b8, "input");
            int b22 = w0.b.b(b8, "output");
            cVar = e8;
            try {
                int b23 = w0.b.b(b8, "initial_delay");
                int b24 = w0.b.b(b8, "interval_duration");
                int b25 = w0.b.b(b8, "flex_duration");
                int b26 = w0.b.b(b8, "run_attempt_count");
                int b27 = w0.b.b(b8, "backoff_policy");
                int b28 = w0.b.b(b8, "backoff_delay_duration");
                int b29 = w0.b.b(b8, "period_start_time");
                int b30 = w0.b.b(b8, "minimum_retention_duration");
                int b31 = w0.b.b(b8, "schedule_requested_at");
                int b32 = w0.b.b(b8, "run_in_foreground");
                int b33 = w0.b.b(b8, "out_of_quota_policy");
                int i8 = b22;
                ArrayList arrayList = new ArrayList(b8.getCount());
                while (b8.moveToNext()) {
                    String string = b8.getString(b17);
                    int i9 = b17;
                    String string2 = b8.getString(b19);
                    int i10 = b19;
                    e1.b bVar = new e1.b();
                    int i11 = b9;
                    bVar.k(v.e(b8.getInt(b9)));
                    bVar.m(b8.getInt(b10) != 0);
                    bVar.n(b8.getInt(b11) != 0);
                    bVar.l(b8.getInt(b12) != 0);
                    bVar.o(b8.getInt(b13) != 0);
                    int i12 = b10;
                    int i13 = b11;
                    bVar.p(b8.getLong(b14));
                    bVar.q(b8.getLong(b15));
                    bVar.j(v.b(b8.getBlob(b16)));
                    p pVar = new p(string, string2);
                    pVar.f24710b = v.g(b8.getInt(b18));
                    pVar.f24712d = b8.getString(b20);
                    pVar.f24713e = androidx.work.b.g(b8.getBlob(b21));
                    int i14 = i8;
                    pVar.f24714f = androidx.work.b.g(b8.getBlob(i14));
                    i8 = i14;
                    int i15 = b23;
                    pVar.f24715g = b8.getLong(i15);
                    int i16 = b20;
                    int i17 = b24;
                    pVar.f24716h = b8.getLong(i17);
                    int i18 = b12;
                    int i19 = b25;
                    pVar.f24717i = b8.getLong(i19);
                    int i20 = b26;
                    pVar.f24719k = b8.getInt(i20);
                    int i21 = b27;
                    pVar.f24720l = v.d(b8.getInt(i21));
                    b25 = i19;
                    int i22 = b28;
                    pVar.f24721m = b8.getLong(i22);
                    int i23 = b29;
                    pVar.f24722n = b8.getLong(i23);
                    b29 = i23;
                    int i24 = b30;
                    pVar.f24723o = b8.getLong(i24);
                    int i25 = b31;
                    pVar.f24724p = b8.getLong(i25);
                    int i26 = b32;
                    pVar.f24725q = b8.getInt(i26) != 0;
                    int i27 = b33;
                    pVar.f24726r = v.f(b8.getInt(i27));
                    pVar.f24718j = bVar;
                    arrayList.add(pVar);
                    b28 = i22;
                    b12 = i18;
                    b27 = i21;
                    b33 = i27;
                    b10 = i12;
                    b20 = i16;
                    b23 = i15;
                    b24 = i17;
                    b26 = i20;
                    b31 = i25;
                    b17 = i9;
                    b19 = i10;
                    b9 = i11;
                    b32 = i26;
                    b30 = i24;
                    b11 = i13;
                }
                b8.close();
                cVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b8.close();
                cVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = e8;
        }
    }

    @Override // m1.q
    public int u() {
        this.f24729a.b();
        x0.f a8 = this.f24737i.a();
        this.f24729a.c();
        try {
            int J = a8.J();
            this.f24729a.r();
            return J;
        } finally {
            this.f24729a.g();
            this.f24737i.f(a8);
        }
    }
}
