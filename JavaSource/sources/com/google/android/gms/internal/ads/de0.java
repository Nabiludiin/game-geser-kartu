package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class de0 extends me0 {

    /* renamed from: c, reason: collision with root package name */
    private final Map f7070c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f7071d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7072e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7073f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7074g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7075h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7076i;

    public de0(mr0 mr0Var, Map map) {
        super(mr0Var, "createCalendarEvent");
        this.f7070c = map;
        this.f7071d = mr0Var.i();
        this.f7072e = k("description");
        this.f7075h = k("summary");
        this.f7073f = l("start_ticks");
        this.f7074g = l("end_ticks");
        this.f7076i = k("location");
    }

    private final String k(String str) {
        Map map = this.f7070c;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long l(String str) {
        String str2 = (String) this.f7070c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void h() {
        Context context = this.f7071d;
        if (context == null) {
            b("Activity context is not available.");
            return;
        }
        r2.t.g();
        if (!new ay(context).b()) {
            b("This feature is not available on the device.");
            return;
        }
        r2.t.g();
        AlertDialog.Builder o7 = v2.f2.o(context);
        Resources h8 = r2.t.l().h();
        o7.setTitle(h8 != null ? h8.getString(p2.d.f25108r) : "Create calendar event");
        o7.setMessage(h8 != null ? h8.getString(p2.d.f25109s) : "Allow Ad to create a calendar event?");
        o7.setPositiveButton(h8 != null ? h8.getString(p2.d.f25106p) : "Accept", new be0(this));
        o7.setNegativeButton(h8 != null ? h8.getString(p2.d.f25107q) : "Decline", new ce0(this));
        o7.create().show();
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f7072e);
        data.putExtra("eventLocation", this.f7076i);
        data.putExtra("description", this.f7075h);
        long j7 = this.f7073f;
        if (j7 > -1) {
            data.putExtra("beginTime", j7);
        }
        long j8 = this.f7074g;
        if (j8 > -1) {
            data.putExtra("endTime", j8);
        }
        data.setFlags(268435456);
        return data;
    }

    final /* synthetic */ Context j() {
        return this.f7071d;
    }
}
