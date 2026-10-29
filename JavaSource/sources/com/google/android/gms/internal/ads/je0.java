package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* compiled from: MyApplication */
public final class je0 extends me0 {

    /* renamed from: c, reason: collision with root package name */
    private final Map f10518c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f10519d;

    public je0(mr0 mr0Var, Map map) {
        super(mr0Var, "storePicture");
        this.f10518c = map;
        this.f10519d = mr0Var.i();
    }

    public final void h() {
        Context context = this.f10519d;
        if (context == null) {
            b("Activity context is not available");
            return;
        }
        r2.t.g();
        if (!new ay(context).a()) {
            b("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f10518c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            b("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            b("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        r2.t.g();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            b("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources h8 = r2.t.l().h();
        r2.t.g();
        AlertDialog.Builder o7 = v2.f2.o(context);
        o7.setTitle(h8 != null ? h8.getString(p2.d.f25104n) : "Save image");
        o7.setMessage(h8 != null ? h8.getString(p2.d.f25105o) : "Allow Ad to store image in Picture gallery?");
        o7.setPositiveButton(h8 != null ? h8.getString(p2.d.f25106p) : "Accept", new he0(this, str, lastPathSegment));
        o7.setNegativeButton(h8 != null ? h8.getString(p2.d.f25107q) : "Decline", new ie0(this));
        o7.create().show();
    }

    final /* synthetic */ Context i() {
        return this.f10519d;
    }
}
