package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.tw3;
import com.google.android.gms.internal.measurement.cf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: MyApplication */
final class u extends ad {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f22667f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    static final String[] f22668g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f22669h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f22670i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f22671j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f22672k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f22673l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f22674m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f22675n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f22676o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f22677p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final t f22678d;

    /* renamed from: e, reason: collision with root package name */
    private final qc f22679e;

    u(pd pdVar) {
        super(pdVar);
        this.f22679e = new qc(this.f22928a.f());
        this.f22928a.w();
        this.f22678d = new t(this, this.f22928a.e(), "google_app_measurement.db");
    }

    private final String M(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e8) {
                this.f22928a.a().o().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase u02 = u0();
            if (contentValues.getAsString("app_id") == null) {
                this.f22928a.a().q().b("Value of the primary key is not set.", p5.x("app_id"));
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id");
            sb.append(" = ?");
            if (u02.update("consent_settings", contentValues, sb.toString(), new String[]{r2}) == 0 && u02.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f22928a.a().o().c("Failed to insert/update table (got -1). key", p5.x("consent_settings"), p5.x("app_id"));
            }
        } catch (SQLiteException e8) {
            this.f22928a.a().o().d("Error storing into table. key", p5.x("consent_settings"), p5.x("app_id"), e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.c0 O(java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.O(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.c0");
    }

    private final void P(String str, c0 c0Var) {
        p3.o.m(c0Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = c0Var.f21918a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c0Var.f21919b);
        contentValues.put("lifetime_count", Long.valueOf(c0Var.f21920c));
        contentValues.put("current_bundle_count", Long.valueOf(c0Var.f21921d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c0Var.f21923f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c0Var.f21924g));
        contentValues.put("last_bundled_day", c0Var.f21925h);
        contentValues.put("last_sampled_complex_event_id", c0Var.f21926i);
        contentValues.put("last_sampling_rate", c0Var.f21927j);
        contentValues.put("current_session_count", Long.valueOf(c0Var.f21922e));
        Boolean bool = c0Var.f21928k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f22928a.a().o().b("Failed to insert/update event aggregates (got -1). appId", p5.x(str2));
            }
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error storing event aggregates. appId", p5.x(c0Var.f21918a), e8);
        }
    }

    private final void Q(String str, String str2) {
        p3.o.g(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error deleting snapshot. appId", p5.x(str2), e8);
        }
    }

    private final sd R(String str, long j7, byte[] bArr, String str2, String str3, int i7, int i8, long j8, long j9, long j10) {
        if (TextUtils.isEmpty(str2)) {
            this.f22928a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.p6 p6Var = (com.google.android.gms.internal.measurement.p6) td.W(com.google.android.gms.internal.measurement.s6.M(), bArr);
            t4.k0 c8 = t4.k0.c(i7);
            if (c8 != t4.k0.GOOGLE_SIGNAL && c8 != t4.k0.GOOGLE_SIGNAL_PENDING && i8 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = p6Var.x().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.t6 t6Var = (com.google.android.gms.internal.measurement.t6) ((com.google.android.gms.internal.measurement.u6) it.next()).s();
                    t6Var.D0(i8);
                    arrayList.add((com.google.android.gms.internal.measurement.u6) t6Var.s());
                }
                p6Var.D();
                p6Var.C(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    String str4 = split[i9];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        this.f22928a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i9++;
                }
            }
            rd rdVar = new rd();
            rdVar.b(j7);
            rdVar.c((com.google.android.gms.internal.measurement.s6) p6Var.s());
            rdVar.d(str2);
            rdVar.e(hashMap);
            rdVar.f(c8);
            rdVar.g(j8);
            rdVar.h(j9);
            rdVar.i(j10);
            rdVar.j(i8);
            return rdVar.a();
        } catch (IOException e8) {
            this.f22928a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e8);
            return null;
        }
    }

    private final String S() {
        w6 w6Var = this.f22928a;
        long a8 = w6Var.f().a();
        Locale locale = Locale.US;
        t4.k0 k0Var = t4.k0.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(k0Var.a());
        Long valueOf2 = Long.valueOf(a8);
        w6Var.w();
        Long l7 = (Long) c5.T.b(null);
        l7.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", valueOf, valueOf2, l7);
        Integer valueOf3 = Integer.valueOf(k0Var.a());
        w6Var.w();
        String format2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", valueOf3, valueOf2, Long.valueOf(m.q()));
        StringBuilder sb = new StringBuilder(format.length() + 5 + format2.length() + 1);
        sb.append("(");
        sb.append(format);
        sb.append(" OR ");
        sb.append(format2);
        sb.append(")");
        return sb.toString();
    }

    private static final String T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    static final void o0(ContentValues contentValues, String str, Object obj) {
        p3.o.g("value");
        p3.o.m(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = u0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j7 = rawQuery.getLong(0);
                rawQuery.close();
                return j7;
            } catch (SQLiteException e8) {
                this.f22928a.a().o().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long q0(String str, String[] strArr, long j7) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j7 = cursor.getLong(0);
                }
                cursor.close();
                return j7;
            } catch (SQLiteException e8) {
                this.f22928a.a().o().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(wd wdVar) {
        p3.o.m(wdVar);
        h();
        j();
        String str = wdVar.f22830a;
        String str2 = wdVar.f22832c;
        if (B0(str, str2) == null) {
            if (yd.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f22928a.w().F(str, c5.W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long p02 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, wdVar.f22831b});
                this.f22928a.w();
                if (p02 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", wdVar.f22831b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(wdVar.f22833d));
        o0(contentValues, "value", wdVar.f22834e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f22928a.a().o().b("Failed to insert/update user property (got -1). appId", p5.x(str));
            return true;
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error storing user property. appId", p5.x(wdVar.f22830a), e8);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.wd B0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            p3.o.g(r11)
            p3.o.g(r12)
            r10.h()
            r10.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.u0()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r0 != 0) goto L32
            goto L99
        L32:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r0 = 1
            java.lang.Object r9 = r10.x(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r9 != 0) goto L40
            goto L99
        L40:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            com.google.android.gms.measurement.internal.wd r3 = new com.google.android.gms.measurement.internal.wd     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            if (r11 == 0) goto L6c
            com.google.android.gms.measurement.internal.w6 r11 = r10.f22928a     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.p5 r11 = r11.a()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.n5 r11 = r11.o()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.p5.x(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            r11.b(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            goto L6c
        L66:
            r0 = move-exception
            r11 = r0
            goto L74
        L69:
            r0 = move-exception
        L6a:
            r11 = r0
            goto L7e
        L6c:
            r2.close()
            return r3
        L70:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6a
        L74:
            r1 = r2
            goto L9f
        L76:
            r0 = move-exception
            r11 = r0
            goto L9f
        L79:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7e:
            com.google.android.gms.measurement.internal.w6 r12 = r10.f22928a     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.p5 r0 = r12.a()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.n5 r0 = r0.o()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.p5.x(r4)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.i5 r12 = r12.D()     // Catch: java.lang.Throwable -> L66
            java.lang.String r12 = r12.c(r6)     // Catch: java.lang.Throwable -> L66
            r0.d(r3, r4, r12, r11)     // Catch: java.lang.Throwable -> L66
        L99:
            if (r2 == 0) goto L9e
            r2.close()
        L9e:
            return r1
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.B0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.wd");
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List C0(java.lang.String r13) {
        /*
            r12 = this;
            p3.o.g(r13)
            r12.h()
            r12.j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.u0()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r4 = "origin"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r8 = "rowid"
            com.google.android.gms.measurement.internal.w6 r11 = r12.f22928a     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            r11.w()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r1 == 0) goto L9d
        L3c:
            r1 = 0
            java.lang.String r5 = r10.getString(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1 = 1
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r1 != 0) goto L4a
            java.lang.String r1 = ""
        L4a:
            r4 = r1
            goto L52
        L4c:
            r0 = move-exception
            r13 = r0
            goto La3
        L4f:
            r0 = move-exception
            r3 = r13
            goto L88
        L52:
            r1 = 2
            long r6 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1 = 3
            java.lang.Object r8 = r12.x(r10, r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r8 != 0) goto L71
            com.google.android.gms.measurement.internal.p5 r1 = r11.a()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            com.google.android.gms.measurement.internal.n5 r1 = r1.o()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            java.lang.String r2 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.p5.x(r13)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r3 = r13
            goto L7a
        L71:
            com.google.android.gms.measurement.internal.wd r2 = new com.google.android.gms.measurement.internal.wd     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
            r0.add(r2)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
        L7a:
            boolean r13 = r10.moveToNext()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
            if (r13 != 0) goto L81
            goto L9d
        L81:
            r13 = r3
            goto L3c
        L83:
            r0 = move-exception
            goto L88
        L85:
            r0 = move-exception
            r3 = r13
            r13 = r0
        L88:
            com.google.android.gms.measurement.internal.w6 r13 = r12.f22928a     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.measurement.internal.p5 r13 = r13.a()     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.measurement.internal.n5 r13 = r13.o()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "Error querying user properties. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.p5.x(r3)     // Catch: java.lang.Throwable -> L4c
            r13.c(r1, r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L4c
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r0
        La3:
            if (r10 == 0) goto La8
            r10.close()
        La8:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.C0(java.lang.String):java.util.List");
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r0 = r8.a().o();
        r8.w();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List D0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.D0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long E(String str) {
        p3.o.g(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(i iVar) {
        p3.o.m(iVar);
        h();
        j();
        String str = iVar.f22220q;
        p3.o.m(str);
        if (B0(str, iVar.f22222s.f22701r) == null) {
            long p02 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f22928a.w();
            if (p02 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", iVar.f22221r);
        contentValues.put("name", iVar.f22222s.f22701r);
        o0(contentValues, "value", p3.o.m(iVar.f22222s.M0()));
        contentValues.put("active", Boolean.valueOf(iVar.f22224u));
        contentValues.put("trigger_event_name", iVar.f22225v);
        contentValues.put("trigger_timeout", Long.valueOf(iVar.f22227x));
        w6 w6Var = this.f22928a;
        contentValues.put("timed_out_event", w6Var.C().T(iVar.f22226w));
        contentValues.put("creation_timestamp", Long.valueOf(iVar.f22223t));
        contentValues.put("triggered_event", w6Var.C().T(iVar.f22228y));
        contentValues.put("triggered_timestamp", Long.valueOf(iVar.f22222s.f22702s));
        contentValues.put("time_to_live", Long.valueOf(iVar.f22229z));
        contentValues.put("expired_event", w6Var.C().T(iVar.A));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            w6Var.a().o().b("Failed to insert/update conditional user property (got -1)", p5.x(str));
            return true;
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error storing conditional user property", p5.x(str), e8);
            return true;
        }
    }

    public final boolean F(String str, Long l7, long j7, com.google.android.gms.internal.measurement.i6 i6Var) {
        h();
        j();
        p3.o.m(i6Var);
        p3.o.g(str);
        p3.o.m(l7);
        w6 w6Var = this.f22928a;
        byte[] c8 = i6Var.c();
        w6Var.a().w().c("Saving complex main event, appId, data size", w6Var.D().a(str), Integer.valueOf(c8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", c8);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            w6Var.a().o().b("Failed to insert complex main event (got -1). appId", p5.x(str));
            return false;
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error storing complex main event. appId", p5.x(str), e8);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.i F0(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.F0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.i");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:27:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle G(java.lang.String r6) {
        /*
            r5 = this;
            r5.h()
            r5.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.u0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            com.google.android.gms.measurement.internal.w6 r6 = r5.f22928a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.p5 r6 = r6.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.n5 r6 = r6.w()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.h6 r3 = com.google.android.gms.internal.measurement.i6.P()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.wb r2 = com.google.android.gms.measurement.internal.td.W(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.h6 r2 = (com.google.android.gms.internal.measurement.h6) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.xa r2 = r2.s()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.i6 r2 = (com.google.android.gms.internal.measurement.i6) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.measurement.internal.pd r6 = r5.f22755b     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.K0()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.F()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.td.q(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r6
        L55:
            r2 = move-exception
            com.google.android.gms.measurement.internal.w6 r3 = r5.f22928a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.p5 r3 = r3.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.n5 r3 = r3.o()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.p5.x(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r6 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.w6 r2 = r5.f22928a     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.p5 r2 = r2.a()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.n5 r2 = r2.o()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.G(java.lang.String):android.os.Bundle");
    }

    public final int G0(String str, String str2) {
        p3.o.g(str);
        p3.o.g(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            w6 w6Var = this.f22928a;
            w6Var.a().o().d("Error deleting conditional property", p5.x(str), w6Var.D().c(str2), e8);
            return 0;
        }
    }

    final boolean H(String str, long j7) {
        try {
            if (q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j7)}, 0L) > 0) {
                return false;
            }
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j7)}, 0L) > 0;
        } catch (SQLiteException e8) {
            this.f22928a.a().o().b("Error checking backfill conditions", e8);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        p3.o.g(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return I0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a7 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:78:0x028c, B:80:0x02a7), top: B:77:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.I(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r2 = r12.a().o();
        r12.w();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List I0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.I0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.d8 J(java.lang.String r5) {
        /*
            r4 = this;
            p3.o.m(r5)
            r4.h()
            r4.j()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.u0()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            com.google.android.gms.measurement.internal.w6 r0 = r4.f22928a     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p5 r0 = r0.a()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.n5 r0 = r0.w()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.a(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r5.close()
            goto L5e
        L31:
            r0 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4c
        L35:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.d8 r1 = com.google.android.gms.measurement.internal.d8.f(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r5
            goto L64
        L46:
            r5 = move-exception
            r0 = r5
            goto L64
        L49:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L4c:
            com.google.android.gms.measurement.internal.w6 r2 = r4.f22928a     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.p5 r2 = r2.a()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.n5 r2 = r2.o()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Error querying database."
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            goto L2d
        L5e:
            if (r1 != 0) goto L63
            com.google.android.gms.measurement.internal.d8 r5 = com.google.android.gms.measurement.internal.d8.f22051c
            return r5
        L63:
            return r1
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.J(java.lang.String):com.google.android.gms.measurement.internal.d8");
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.v5 J0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.J0(java.lang.String):com.google.android.gms.measurement.internal.v5");
    }

    public final boolean K(String str, rc rcVar) {
        h();
        j();
        p3.o.m(rcVar);
        p3.o.g(str);
        w6 w6Var = this.f22928a;
        long a8 = w6Var.f().a();
        b5 b5Var = c5.f21990w0;
        long longValue = a8 - ((Long) b5Var.b(null)).longValue();
        long j7 = rcVar.f22581r;
        if (j7 < longValue || j7 > ((Long) b5Var.b(null)).longValue() + a8) {
            w6Var.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", p5.x(str), Long.valueOf(a8), Long.valueOf(j7));
        }
        w6Var.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", rcVar.f22580q);
        contentValues.put("source", Integer.valueOf(rcVar.f22582s));
        contentValues.put("timestamp_millis", Long.valueOf(j7));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            w6Var.a().o().b("Failed to insert trigger URI (got -1). appId", p5.x(str));
            return false;
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error storing trigger URI. appId", p5.x(str), e8);
            return false;
        }
    }

    public final void K0(v5 v5Var, boolean z7, boolean z8) {
        p3.o.m(v5Var);
        h();
        j();
        String o02 = v5Var.o0();
        p3.o.m(o02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", o02);
        if (z7) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f22755b.g(o02).o(t4.v.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", v5Var.p0());
        }
        contentValues.put("gmp_app_id", v5Var.r0());
        pd pdVar = this.f22755b;
        if (pdVar.g(o02).o(t4.v.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", v5Var.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(v5Var.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(v5Var.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(v5Var.B0()));
        contentValues.put("app_version", v5Var.D0());
        contentValues.put("app_store", v5Var.H0());
        contentValues.put("gmp_version", Long.valueOf(v5Var.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(v5Var.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(v5Var.d()));
        contentValues.put("day", Long.valueOf(v5Var.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(v5Var.p()));
        contentValues.put("daily_events_count", Long.valueOf(v5Var.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(v5Var.t()));
        contentValues.put("config_fetched_time", Long.valueOf(v5Var.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(v5Var.j()));
        contentValues.put("app_version_int", Long.valueOf(v5Var.F0()));
        contentValues.put("firebase_instance_id", v5Var.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(v5Var.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(v5Var.v()));
        contentValues.put("health_monitor_sample", v5Var.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(v5Var.P()));
        contentValues.put("dynamite_version", Long.valueOf(v5Var.b()));
        if (pdVar.g(o02).o(t4.v.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", v5Var.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(v5Var.V()));
        contentValues.put("target_os_version", Long.valueOf(v5Var.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(v5Var.Z()));
        cf.a();
        w6 w6Var = this.f22928a;
        if (w6Var.w().H(o02, c5.Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(v5Var.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(v5Var.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(v5Var.d0()));
        contentValues.put("npa_metadata_value", v5Var.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(v5Var.G()));
        contentValues.put("sgtm_preview_key", v5Var.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(v5Var.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(v5Var.D()));
        contentValues.put("serialized_npa_metadata", v5Var.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(v5Var.M()));
        List T = v5Var.T();
        if (T != null) {
            if (T.isEmpty()) {
                w6Var.a().r().b("Safelisted events should not be an empty list. appId", o02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", T));
            }
        }
        com.google.android.gms.internal.measurement.de.a();
        if (w6Var.w().H(null, c5.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", v5Var.f0());
        contentValues.put("unmatched_uwa", v5Var.h0());
        contentValues.put("ad_campaign_info", v5Var.K());
        try {
            SQLiteDatabase u02 = u0();
            if (u02.update("apps", contentValues, "app_id = ?", new String[]{o02}) == 0 && u02.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                w6Var.a().o().b("Failed to insert/update app (got -1). appId", p5.x(o02));
            }
        } catch (SQLiteException e8) {
            this.f22928a.a().o().c("Error storing app. appId", p5.x(o02), e8);
        }
    }

    public final void L(String str, d8 d8Var) {
        p3.o.m(str);
        p3.o.m(d8Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", d8Var.l());
        contentValues.put("consent_source", Integer.valueOf(d8Var.b()));
        N("consent_settings", "app_id", contentValues);
    }

    public final q L0(long j7, String str, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return M0(j7, str, 1L, false, false, z9, false, z11, z12, z13);
    }

    public final q M0(long j7, String str, long j8, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        p3.o.g(str);
        h();
        j();
        String[] strArr = {str};
        q qVar = new q();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u02 = u0();
                cursor = u02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j7) {
                        qVar.f22514b = cursor.getLong(1);
                        qVar.f22513a = cursor.getLong(2);
                        qVar.f22515c = cursor.getLong(3);
                        qVar.f22516d = cursor.getLong(4);
                        qVar.f22517e = cursor.getLong(5);
                        qVar.f22518f = cursor.getLong(6);
                        qVar.f22519g = cursor.getLong(7);
                    }
                    if (z7) {
                        qVar.f22514b += j8;
                    }
                    if (z8) {
                        qVar.f22513a += j8;
                    }
                    if (z9) {
                        qVar.f22515c += j8;
                    }
                    if (z10) {
                        qVar.f22516d += j8;
                    }
                    if (z11) {
                        qVar.f22517e += j8;
                    }
                    if (z12) {
                        qVar.f22518f += j8;
                    }
                    if (z13) {
                        qVar.f22519g += j8;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j7));
                    contentValues.put("daily_public_events_count", Long.valueOf(qVar.f22513a));
                    contentValues.put("daily_events_count", Long.valueOf(qVar.f22514b));
                    contentValues.put("daily_conversions_count", Long.valueOf(qVar.f22515c));
                    contentValues.put("daily_error_events_count", Long.valueOf(qVar.f22516d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(qVar.f22517e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(qVar.f22518f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(qVar.f22519g));
                    u02.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f22928a.a().r().b("Not updating daily counts, app is not known. appId", p5.x(str));
                }
            } catch (SQLiteException e8) {
                this.f22928a.a().o().c("Error updating daily counts. appId", p5.x(str), e8);
            }
            if (cursor != null) {
                cursor.close();
            }
            return qVar;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.p N0(java.lang.String r11) {
        /*
            r10 = this;
            p3.o.g(r11)
            r10.h()
            r10.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.u0()     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r0 != 0) goto L2e
            goto L82
        L2e:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r5 == 0) goto L5c
            com.google.android.gms.measurement.internal.w6 r5 = r10.f22928a     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.p5 r5 = r5.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.n5 r5 = r5.o()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.p5.x(r11)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            goto L5c
        L57:
            r0 = move-exception
            r11 = r0
            goto L68
        L5a:
            r0 = move-exception
            goto L6f
        L5c:
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            com.google.android.gms.measurement.internal.p r5 = new com.google.android.gms.measurement.internal.p     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r2.close()
            return r5
        L68:
            r1 = r2
            goto L88
        L6a:
            r0 = move-exception
            r11 = r0
            goto L88
        L6d:
            r0 = move-exception
            r2 = r1
        L6f:
            com.google.android.gms.measurement.internal.w6 r3 = r10.f22928a     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.p5 r3 = r3.a()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.n5 r3 = r3.o()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.p5.x(r11)     // Catch: java.lang.Throwable -> L57
            r3.c(r4, r11, r0)     // Catch: java.lang.Throwable -> L57
        L82:
            if (r2 == 0) goto L87
            r2.close()
        L87:
            return r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.N0(java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r3 > (com.google.android.gms.measurement.internal.m.q() + r1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O0(com.google.android.gms.internal.measurement.u6 r8, boolean r9) {
        /*
            r7 = this;
            r7.h()
            r7.j()
            p3.o.m(r8)
            java.lang.String r0 = r8.F()
            p3.o.g(r0)
            boolean r0 = r8.u2()
            p3.o.p(r0)
            r7.u()
            com.google.android.gms.measurement.internal.w6 r0 = r7.f22928a
            com.google.android.gms.common.util.e r1 = r0.f()
            long r1 = r1.a()
            long r3 = r8.v2()
            r0.w()
            long r5 = com.google.android.gms.measurement.internal.m.q()
            long r5 = r1 - r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L45
            long r3 = r8.v2()
            r0.w()
            long r5 = com.google.android.gms.measurement.internal.m.q()
            long r5 = r5 + r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L66
        L45:
            com.google.android.gms.measurement.internal.p5 r0 = r0.a()
            com.google.android.gms.measurement.internal.n5 r0 = r0.r()
            java.lang.String r3 = r8.F()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.p5.x(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r4 = r8.v2()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r0.d(r4, r3, r1, r2)
        L66:
            byte[] r0 = r8.c()
            r1 = 0
            com.google.android.gms.measurement.internal.pd r2 = r7.f22755b     // Catch: java.io.IOException -> L108
            com.google.android.gms.measurement.internal.td r2 = r2.K0()     // Catch: java.io.IOException -> L108
            byte[] r0 = r2.V(r0)     // Catch: java.io.IOException -> L108
            com.google.android.gms.measurement.internal.w6 r2 = r7.f22928a
            com.google.android.gms.measurement.internal.p5 r3 = r2.a()
            com.google.android.gms.measurement.internal.n5 r3 = r3.w()
            int r4 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Saving bundle, size"
            r3.b(r5, r4)
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = r8.F()
            java.lang.String r5 = "app_id"
            r3.put(r5, r4)
            long r4 = r8.v2()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "bundle_end_timestamp"
            r3.put(r5, r4)
            java.lang.String r4 = "data"
            r3.put(r4, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "has_realtime"
            r3.put(r0, r9)
            boolean r9 = r8.G0()
            if (r9 == 0) goto Lc5
            int r9 = r8.H0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "retry_count"
            r3.put(r0, r9)
        Lc5:
            android.database.sqlite.SQLiteDatabase r9 = r7.u0()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "queue"
            r4 = 0
            long r3 = r9.insert(r0, r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r5 = -1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto Lee
            com.google.android.gms.measurement.internal.p5 r9 = r2.a()     // Catch: android.database.sqlite.SQLiteException -> Lec
            com.google.android.gms.measurement.internal.n5 r9 = r9.o()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r8.F()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.Object r2 = com.google.android.gms.measurement.internal.p5.x(r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r9.b(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            return r1
        Lec:
            r9 = move-exception
            goto Lf0
        Lee:
            r8 = 1
            return r8
        Lf0:
            com.google.android.gms.measurement.internal.w6 r0 = r7.f22928a
            com.google.android.gms.measurement.internal.p5 r0 = r0.a()
            com.google.android.gms.measurement.internal.n5 r0 = r0.o()
            java.lang.String r8 = r8.F()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.p5.x(r8)
            java.lang.String r2 = "Error storing bundle. appId"
            r0.c(r2, r8, r9)
            return r1
        L108:
            r9 = move-exception
            com.google.android.gms.measurement.internal.w6 r0 = r7.f22928a
            com.google.android.gms.measurement.internal.p5 r0 = r0.a()
            com.google.android.gms.measurement.internal.n5 r0 = r0.o()
            java.lang.String r8 = r8.F()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.p5.x(r8)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
            r0.c(r2, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.O0(com.google.android.gms.internal.measurement.u6, boolean):boolean");
    }

    public final y U(String str) {
        p3.o.m(str);
        h();
        j();
        return y.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void V(String str, y yVar) {
        p3.o.m(str);
        p3.o.m(yVar);
        h();
        j();
        d8 J = J(str);
        d8 d8Var = d8.f22051c;
        if (J == d8Var) {
            L(str, d8Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", yVar.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, d8 d8Var) {
        p3.o.m(str);
        p3.o.m(d8Var);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", d8Var.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final d8 X(String str) {
        p3.o.m(str);
        h();
        j();
        return d8.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0287, code lost:
    
        r22.f22928a.a().o().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.p5.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x037e, code lost:
    
        j();
        h();
        p3.o.g(r23);
        r0 = u0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0497, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e1, code lost:
    
        r0 = r22.f22928a.a().r();
        r11 = com.google.android.gms.measurement.internal.p5.x(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        if (r12.F() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.b4) r3.next();
        j();
        h();
        p3.o.g(r23);
        p3.o.m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c6, code lost:
    
        if (r7.H().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f8, code lost:
    
        r11 = r7.c();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0311, code lost:
    
        if (r7.F() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x032f, code lost:
    
        if (r7.L() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0331, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        r12.put("session_scoped", r0);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034d, code lost:
    
        if (u0().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034f, code lost:
    
        r22.f22928a.a().o().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.p5.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036b, code lost:
    
        r22.f22928a.a().o().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.p5.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c8, code lost:
    
        r0 = r22.f22928a.a().r();
        r9 = com.google.android.gms.measurement.internal.p5.x(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e0, code lost:
    
        if (r7.F() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ef, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        r11 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.b4) r11.next()).F() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        r22.f22928a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.p5.x(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r11 = r0.K().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.t3) r11.next();
        j();
        h();
        p3.o.g(r23);
        p3.o.m(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r12.H().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0213, code lost:
    
        r3 = r12.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        if (r12.F() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024b, code lost:
    
        if (r12.P() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.Q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (u0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026b, code lost:
    
        r22.f22928a.a().o().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.p5.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0286, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void Y(java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.Y(java.lang.String, java.util.List):void");
    }

    final c0 Z(String str, com.google.android.gms.internal.measurement.i6 i6Var, String str2) {
        c0 O = O("events", str, i6Var.I());
        if (O == null) {
            w6 w6Var = this.f22928a;
            w6Var.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", p5.x(str), w6Var.D().a(str2));
            return new c0(str, i6Var.I(), 1L, 1L, 1L, i6Var.K(), 0L, null, null, null, null);
        }
        long j7 = O.f21922e + 1;
        long j8 = O.f21921d + 1;
        return new c0(O.f21918a, O.f21919b, O.f21920c + 1, j8, j7, O.f21923f, O.f21924g, O.f21925h, O.f21926i, O.f21927j, O.f21928k);
    }

    protected final boolean a0() {
        w6 w6Var = this.f22928a;
        Context e8 = w6Var.e();
        w6Var.w();
        return e8.getDatabasePath("google_app_measurement.db").exists();
    }

    final /* synthetic */ long b0(String str, String[] strArr, long j7) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        return false;
    }

    public final long m(String str, com.google.android.gms.internal.measurement.s6 s6Var, String str2, Map map, t4.k0 k0Var, Long l7) {
        int delete;
        h();
        j();
        p3.o.m(s6Var);
        p3.o.g(str);
        h();
        j();
        if (a0()) {
            pd pdVar = this.f22755b;
            long a8 = pdVar.L0().f22862f.a();
            w6 w6Var = this.f22928a;
            long b8 = w6Var.f().b();
            long abs = Math.abs(b8 - a8);
            w6Var.w();
            if (abs > m.r()) {
                pdVar.L0().f22862f.b(b8);
                h();
                j();
                if (a0() && (delete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    w6Var.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                p3.o.g(str);
                h();
                j();
                try {
                    int E = w6Var.w().E(str, c5.A);
                    if (E > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(E)});
                    }
                } catch (SQLiteException e8) {
                    this.f22928a.a().o().c("Error deleting over the limit queued batches. appId", p5.x(str), e8);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] c8 = s6Var.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", c8);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", tw3.a("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(k0Var.a()));
        w6 w6Var2 = this.f22928a;
        contentValues.put("creation_timestamp", Long.valueOf(w6Var2.f().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l7 != null) {
            contentValues.put("associated_row_id", l7);
        }
        try {
            long insert = u0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            w6Var2.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e9) {
            this.f22928a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e9);
            return -1L;
        }
    }

    final /* synthetic */ qc m0() {
        return this.f22679e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.sd n(long r19) {
        /*
            r18 = this;
            r18.h()
            r18.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.u0()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            if (r0 != 0) goto L42
            r3 = r18
            goto Lab
        L42:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.Object r0 = p3.o.m(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r3 = r18
            r5 = r19
            com.google.android.gms.measurement.internal.sd r0 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r2.close()
            return r0
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = move-exception
            goto L8c
        L88:
            r3 = r18
        L8a:
            r1 = r2
            goto Lb3
        L8c:
            r3 = r18
            goto L98
        L8f:
            r0 = move-exception
            goto L93
        L91:
            r0 = move-exception
            goto L96
        L93:
            r3 = r18
            goto Lb3
        L96:
            r2 = r1
            goto L8c
        L98:
            com.google.android.gms.measurement.internal.w6 r4 = r3.f22928a     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.p5 r4 = r4.a()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.n5 r4 = r4.o()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> Lb1
            r4.c(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb1
        Lab:
            if (r2 == 0) goto Lb0
            r2.close()
        Lb0:
            return r1
        Lb1:
            r0 = move-exception
            goto L8a
        Lb3:
            if (r1 == 0) goto Lb8
            r1.close()
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.n(long):com.google.android.gms.measurement.internal.sd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(java.lang.String r20, long r21, long r23, com.google.android.gms.measurement.internal.ld r25) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.n0(java.lang.String, long, long, com.google.android.gms.measurement.internal.ld):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List o(java.lang.String r19, t4.n0 r20, int r21) {
        /*
            r18 = this;
            p3.o.g(r19)
            r18.h()
            r18.j()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.u0()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r6 = r20
            java.util.List r6 = r6.f26416q     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = T(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r7 = r18.S()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L6a
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r11 = r0
            goto L6b
        L6a:
            r11 = r2
        L6b:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
        L76:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto Lbd
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r3 = r18
            r4 = r19
            com.google.android.gms.measurement.internal.sd r1 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto L76
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            goto L76
        Lb9:
            r0 = move-exception
            goto Lc0
        Lbb:
            r0 = move-exception
            goto Lc3
        Lbd:
            r3 = r18
            goto Ld8
        Lc0:
            r3 = r18
            goto Ldf
        Lc3:
            r3 = r18
            com.google.android.gms.measurement.internal.w6 r1 = r3.f22928a     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.p5 r1 = r1.a()     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.n5 r1 = r1.o()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.c(r4, r5, r0)     // Catch: java.lang.Throwable -> Lde
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lde
        Ld8:
            if (r2 == 0) goto Ldd
            r2.close()
        Ldd:
            return r0
        Lde:
            r0 = move-exception
        Ldf:
            if (r2 == 0) goto Le4
            r2.close()
        Le4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.o(java.lang.String, t4.n0, int):java.util.List");
    }

    public final boolean p(String str) {
        t4.k0[] k0VarArr = {t4.k0.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(k0VarArr[0].a()));
        String T = T(arrayList);
        String S = S();
        StringBuilder sb = new StringBuilder(String.valueOf(T).length() + 61 + S.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(T);
        sb.append(" AND NOT ");
        sb.append(S);
        return p0(sb.toString(), new String[]{str}) != 0;
    }

    public final void q(Long l7) {
        h();
        j();
        p3.o.m(l7);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l7.toString()}) != 1) {
                this.f22928a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e8) {
            this.f22928a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e8);
            throw e8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String r() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L36
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L22:
            r0 = move-exception
            goto L3c
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.w6 r3 = r6.f22928a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.p5 r3 = r3.a()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.n5 r3 = r3.o()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.r():java.lang.String");
    }

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j7) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j7)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e8) {
            this.f22928a.a().o().b("Failed to delete a bundle in a queue table", e8);
            throw e8;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    final void u() {
        h();
        j();
        if (a0()) {
            pd pdVar = this.f22755b;
            long a8 = pdVar.L0().f22861e.a();
            w6 w6Var = this.f22928a;
            long b8 = w6Var.f().b();
            long abs = Math.abs(b8 - a8);
            w6Var.w();
            if (abs > m.r()) {
                pdVar.L0().f22861e.b(b8);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase u02 = u0();
                    String valueOf = String.valueOf(w6Var.f().a());
                    w6Var.w();
                    int delete = u02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(m.q())});
                    if (delete > 0) {
                        w6Var.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    final SQLiteDatabase u0() {
        h();
        try {
            return this.f22678d.getWritableDatabase();
        } catch (SQLiteException e8) {
            this.f22928a.a().r().b("Error opening database", e8);
            throw e8;
        }
    }

    final void v(List list) {
        h();
        j();
        p3.o.m(list);
        p3.o.o(list.size());
        if (a0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb3.toString(), null) > 0) {
                this.f22928a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u02 = u0();
                StringBuilder sb4 = new StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                u02.execSQL(sb4.toString());
            } catch (SQLiteException e8) {
                this.f22928a.a().o().b("Error incrementing retry count. error", e8);
            }
        }
    }

    public final c0 v0(String str, String str2) {
        return O("events", str, str2);
    }

    final void w(Long l7) {
        h();
        j();
        p3.o.m(l7);
        if (a0()) {
            StringBuilder sb = new StringBuilder(l7.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l7);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb.toString(), null) > 0) {
                this.f22928a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u02 = u0();
                long a8 = this.f22928a.f().a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(a8).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(a8);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l7.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l7);
                sb4.append(" AND retry_count < 2147483647");
                u02.execSQL(sb4.toString());
            } catch (SQLiteException e8) {
                this.f22928a.a().o().b("Error incrementing retry count. error", e8);
            }
        }
    }

    public final void w0(c0 c0Var) {
        P("events", c0Var);
    }

    final Object x(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 0) {
            this.f22928a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            this.f22928a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f22928a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        c0 O;
        Q("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (O = O("events", str, string)) != null) {
                            P("events_snapshot", O);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e8) {
                this.f22928a.a().o().c("Error creating snapshot. appId", p5.x(str), e8);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        P("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.y0(java.lang.String):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|3|4|(2:6|(3:8|9|10)(1:13))|14|15|(3:17|9|10)(4:18|19|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        r13.f22928a.a().o().d("Error inserting column. appId", com.google.android.gms.measurement.internal.p5.x(r14), "first_open_count", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final long z(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            p3.o.g(r14)
            java.lang.String r15 = "first_open_count"
            p3.o.g(r15)
            r13.h()
            r13.j()
            android.database.sqlite.SQLiteDatabase r0 = r13.u0()
            r0.beginTransaction()
            java.lang.String r1 = " from app2 where app_id=?"
            java.lang.String r2 = "select "
            r3 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r6 = 48
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r1)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String[] r2 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5 = -1
            long r1 = r13.q0(r1, r2, r5)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            java.lang.String r8 = "app2"
            java.lang.String r9 = "app_id"
            if (r7 != 0) goto L79
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.put(r9, r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.put(r15, r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r7 = "previous_install_count"
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r2 = 0
            r7 = 5
            long r1 = r0.insertWithOnConflict(r8, r2, r1, r7)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L78
            com.google.android.gms.measurement.internal.w6 r1 = r13.f22928a     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            com.google.android.gms.measurement.internal.p5 r1 = r1.a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            com.google.android.gms.measurement.internal.n5 r1 = r1.o()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r2 = "Failed to insert column (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.p5.x(r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.c(r2, r7, r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            goto Lcc
        L74:
            r14 = move-exception
            goto Ld0
        L76:
            r1 = move-exception
            goto Lb5
        L78:
            r1 = r3
        L79:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.<init>()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.put(r9, r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r9 = 1
            long r9 = r9 + r1
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.put(r15, r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            java.lang.String r9 = "app_id = ?"
            java.lang.String[] r10 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            int r7 = r0.update(r8, r7, r9, r10)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto Lb0
            com.google.android.gms.measurement.internal.w6 r3 = r13.f22928a     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            com.google.android.gms.measurement.internal.p5 r3 = r3.a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            com.google.android.gms.measurement.internal.n5 r3 = r3.o()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            java.lang.String r4 = "Failed to update column (got 0). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.p5.x(r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r3.c(r4, r7, r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            goto Lcc
        Lae:
            r3 = move-exception
            goto Lb8
        Lb0:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
        Lb3:
            r5 = r1
            goto Lcc
        Lb5:
            r11 = r3
            r3 = r1
            r1 = r11
        Lb8:
            com.google.android.gms.measurement.internal.w6 r4 = r13.f22928a     // Catch: java.lang.Throwable -> L74
            com.google.android.gms.measurement.internal.p5 r4 = r4.a()     // Catch: java.lang.Throwable -> L74
            com.google.android.gms.measurement.internal.n5 r4 = r4.o()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "Error inserting column. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.p5.x(r14)     // Catch: java.lang.Throwable -> L74
            r4.d(r5, r14, r15, r3)     // Catch: java.lang.Throwable -> L74
            goto Lb3
        Lcc:
            r0.endTransaction()
            return r5
        Ld0:
            r0.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u.z(java.lang.String, java.lang.String):long");
    }

    public final void z0(String str, String str2) {
        p3.o.g(str);
        p3.o.g(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            w6 w6Var = this.f22928a;
            w6Var.a().o().d("Error deleting user property. appId", p5.x(str), w6Var.D().c(str2), e8);
        }
    }
}
