package androidx.work.impl;

import android.content.Context;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static v0.a f3005a = new C0054a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static v0.a f3006b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static v0.a f3007c = new c(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static v0.a f3008d = new d(6, 7);

    /* renamed from: e, reason: collision with root package name */
    public static v0.a f3009e = new e(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static v0.a f3010f = new f(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static v0.a f3011g = new g(11, 12);

    /* compiled from: MyApplication */
    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    class C0054a extends v0.a {
        C0054a(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.D("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.D("DROP TABLE IF EXISTS alarmInfo");
            bVar.D("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: MyApplication */
    class b extends v0.a {
        b(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: MyApplication */
    class c extends v0.a {
        c(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.D("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: MyApplication */
    class d extends v0.a {
        d(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: MyApplication */
    class e extends v0.a {
        e(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: MyApplication */
    class f extends v0.a {
        f(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: MyApplication */
    class g extends v0.a {
        g(int i7, int i8) {
            super(i7, i8);
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: MyApplication */
    public static class h extends v0.a {

        /* renamed from: c, reason: collision with root package name */
        final Context f3012c;

        public h(Context context, int i7, int i8) {
            super(i7, i8);
            this.f3012c = context;
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            if (this.f26699b >= 10) {
                bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f3012c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: MyApplication */
    public static class i extends v0.a {

        /* renamed from: c, reason: collision with root package name */
        final Context f3013c;

        public i(Context context) {
            super(9, 10);
            this.f3013c = context;
        }

        @Override // v0.a
        public void a(x0.b bVar) {
            bVar.D("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            n1.h.b(this.f3013c, bVar);
            n1.f.a(this.f3013c, bVar);
        }
    }
}
