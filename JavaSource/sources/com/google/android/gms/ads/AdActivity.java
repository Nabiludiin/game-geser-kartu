package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.cf0;
import s2.z;
import w2.p;
import w3.b;

/* compiled from: MyApplication */
public final class AdActivity extends Activity {

    /* renamed from: q, reason: collision with root package name */
    private cf0 f4336q;

    private final void a() {
        cf0 cf0Var = this.f4336q;
        if (cf0Var != null) {
            try {
                cf0Var.p();
            } catch (RemoteException e8) {
                p.i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.V2(i7, i8, intent);
            }
        } catch (Exception e8) {
            p.i("#007 Could not call remote method.", e8);
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                if (!cf0Var.f()) {
                    return;
                }
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
        super.onBackPressed();
        try {
            cf0 cf0Var2 = this.f4336q;
            if (cf0Var2 != null) {
                cf0Var2.c();
            }
        } catch (RemoteException e9) {
            p.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.j0(b.C1(configuration));
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a("AdActivity onCreate");
        cf0 g8 = z.b().g(this);
        this.f4336q = g8;
        if (g8 == null) {
            p.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            g8.x7(bundle);
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        p.a("AdActivity onDestroy");
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.m();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        p.a("AdActivity onPause");
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.k();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.K2(i7, strArr, iArr);
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        p.a("AdActivity onRestart");
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.j();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        p.a("AdActivity onResume");
        super.onResume();
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.l();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.X(bundle);
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        p.a("AdActivity onStart");
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.i();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        p.a("AdActivity onStop");
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.s();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            cf0 cf0Var = this.f4336q;
            if (cf0Var != null) {
                cf0Var.e();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        super.setContentView(i7);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
