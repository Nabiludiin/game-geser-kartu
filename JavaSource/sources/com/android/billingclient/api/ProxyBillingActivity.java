package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.s6;

/* compiled from: MyApplication */
public class ProxyBillingActivity extends Activity {

    /* renamed from: q, reason: collision with root package name */
    private ResultReceiver f3832q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3833r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3834s;

    /* renamed from: t, reason: collision with root package name */
    private int f3835t;

    /* renamed from: u, reason: collision with root package name */
    private long f3836u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3837v;

    private l6 a(int i7) {
        return i7 != -1 ? i7 != 0 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? l6.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : l6.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE : l6.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : l6.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : l6.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : l6.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
    }

    private Intent b(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent c(l6 l6Var, long j7) {
        Intent d8 = d();
        d8.putExtra("RESPONSE_CODE", 6);
        d8.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        d.a d9 = d.d();
        d9.d(6);
        d9.b("An internal error occurred.");
        d a8 = d9.a();
        int i7 = l0.f4000a;
        d8.putExtra("FAILURE_LOGGING_PAYLOAD", l0.b(l6Var, 2, a8, null, s6.BROADCAST_ACTION_UNSPECIFIED).b());
        d8.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        d8.putExtra("billingClientTransactionId", j7);
        d8.putExtra("wasServiceAutoReconnected", this.f3837v);
        return d8;
    }

    private Intent d() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 100
            r1 = 110(0x6e, float:1.54E-43)
            java.lang.String r2 = "ProxyBillingActivity"
            if (r6 == r0) goto L42
            if (r6 != r1) goto Le
            goto L42
        Le:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L27
            int r6 = com.google.android.gms.internal.play_billing.q0.a(r8, r2)
            android.os.ResultReceiver r7 = r5.f3832q
            if (r7 == 0) goto Le6
            if (r8 != 0) goto L1e
            r8 = 0
            goto L22
        L1e:
            android.os.Bundle r8 = r8.getExtras()
        L22:
            r7.send(r6, r8)
            goto Le6
        L27:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.play_billing.q0.l(r2, r6)
            goto Le6
        L42:
            com.android.billingclient.api.d r0 = com.google.android.gms.internal.play_billing.q0.g(r8, r2)
            int r0 = r0.c()
            r3 = -1
            if (r7 != r3) goto L50
            if (r0 == 0) goto L6d
            r7 = r3
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " and billing's responseCode: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.play_billing.q0.l(r2, r0)
            r3 = r7
        L6d:
            if (r8 == 0) goto Lb8
            android.os.Bundle r7 = r8.getExtras()
            if (r7 == 0) goto Laa
            android.os.Bundle r7 = r8.getExtras()
            java.lang.String r0 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "LAUNCH_BILLING_FLOW"
            java.lang.String r2 = "INTENT_SOURCE"
            if (r7 == 0) goto L8d
            android.content.Intent r7 = r5.b(r7)
            r7.putExtra(r2, r0)
            goto L9b
        L8d:
            android.content.Intent r7 = r5.d()
            android.os.Bundle r8 = r8.getExtras()
            r7.putExtras(r8)
            r7.putExtra(r2, r0)
        L9b:
            long r2 = r5.f3836u
            java.lang.String r8 = "billingClientTransactionId"
            r7.putExtra(r8, r2)
            boolean r8 = r5.f3837v
            java.lang.String r0 = "wasServiceAutoReconnected"
            r7.putExtra(r0, r8)
            goto Ldb
        Laa:
            java.lang.String r7 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.q0.l(r2, r7)
            com.google.android.gms.internal.play_billing.l6 r7 = com.google.android.gms.internal.play_billing.l6.NULL_BUNDLE_IN_ACTIVITY_RESULT
            long r2 = r5.f3836u
            android.content.Intent r7 = r5.c(r7, r2)
            goto Ldb
        Lb8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got null data with resultCode "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "!"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.play_billing.q0.l(r2, r7)
            com.google.android.gms.internal.play_billing.l6 r7 = r5.a(r3)
            long r2 = r5.f3836u
            android.content.Intent r7 = r5.c(r7, r2)
        Ldb:
            if (r6 != r1) goto Le3
            java.lang.String r6 = "IS_FIRST_PARTY_PURCHASE"
            r8 = 1
            r7.putExtra(r6, r8)
        Le3:
            r5.sendBroadcast(r7)
        Le6:
            r6 = 0
            r5.f3833r = r6
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.q0.k("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f3833r = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f3832q = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f3834s = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f3835t = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f3836u = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f3837v = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.q0.k("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f3835t = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f3834s = true;
                this.f3835t = androidx.constraintlayout.widget.h.C2;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f3832q = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f3835t = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f3836u = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f3837v = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f3833r = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3835t, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e8) {
            com.google.android.gms.internal.play_billing.q0.m("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e8);
            ResultReceiver resultReceiver = this.f3832q;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent c8 = c(l6.INTENT_SENDER_EXCEPTION, this.f3836u);
                if (this.f3834s) {
                    c8.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(c8);
            }
            this.f3833r = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f3833r) {
            Intent d8 = d();
            d8.putExtra("RESPONSE_CODE", 1);
            d8.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f3834s) {
                d8.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i7 = this.f3835t;
            if (i7 == 110 || i7 == 100) {
                d8.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                d8.putExtra("billingClientTransactionId", this.f3836u);
            }
            sendBroadcast(d8);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3832q;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3833r);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3834s);
        bundle.putInt("activity_code", this.f3835t);
        bundle.putLong("billingClientTransactionId", this.f3836u);
        bundle.putBoolean("wasServiceAutoReconnected", this.f3837v);
    }
}
