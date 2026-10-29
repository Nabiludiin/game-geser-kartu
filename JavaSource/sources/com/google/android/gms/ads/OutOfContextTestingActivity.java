package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.gb0;
import k2.q;
import k2.r;
import s2.t2;
import s2.z;
import w3.b;

/* compiled from: MyApplication */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t2 h8 = z.b().h(this, new gb0());
        if (h8 == null) {
            finish();
            return;
        }
        setContentView(r.f24423a);
        LinearLayout linearLayout = (LinearLayout) findViewById(q.f24422a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            h8.G1(stringExtra, b.C1(this), b.C1(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
