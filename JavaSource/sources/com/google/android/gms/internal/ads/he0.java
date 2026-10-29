package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.Objects;

/* compiled from: MyApplication */
final class he0 implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f9462q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f9463r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ je0 f9464s;

    he0(je0 je0Var, String str, String str2) {
        this.f9462q = str;
        this.f9463r = str2;
        Objects.requireNonNull(je0Var);
        this.f9464s = je0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        DownloadManager downloadManager = (DownloadManager) this.f9464s.i().getSystemService("download");
        try {
            String str = this.f9462q;
            String str2 = this.f9463r;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            r2.t.g();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f9464s.b("Could not store picture.");
        }
    }
}
