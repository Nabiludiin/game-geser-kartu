package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* compiled from: MyApplication */
public interface mr0 extends s2.a, pi1, dr0, q80, vs0, at0, e90, gr, gt0, r2.n, jt0, kt0, bo0, lt0 {
    da2 A0();

    void B0();

    a13 C0();

    List D();

    boolean E0();

    x10 F0();

    WebViewClient G0();

    void H0(us0 us0Var);

    boolean I0();

    void J0(int i7);

    void L0(u2.a0 a0Var);

    void M0(x10 x10Var);

    void N0(u2.a0 a0Var);

    u2.a0 O();

    void O0(String str, y50 y50Var);

    fn P();

    void P0(c03 c03Var, f03 f03Var);

    WebView Q();

    void Q0(vs vsVar);

    bu0 R();

    a5.d R0();

    Context S();

    void S0(boolean z7);

    c03 T();

    void T0(bu0 bu0Var);

    void U();

    void V();

    void V0(Context context);

    boolean W();

    View Z();

    void Z0(boolean z7);

    void a1(String str, String str2, String str3);

    boolean canGoBack();

    void d1(u10 u10Var);

    void destroy();

    void e1(da2 da2Var);

    String f0();

    void f1(boolean z7);

    us0 g();

    void g0();

    @Override // com.google.android.gms.internal.ads.at0, com.google.android.gms.internal.ads.bo0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h1(int i7);

    Activity i();

    boolean i1();

    boolean isAttachedToWindow();

    void j1(fa2 fa2Var);

    fa2 k0();

    r2.a l();

    void l1(boolean z7);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    iz m();

    void m0();

    void measure(int i7, int i8);

    boolean n0();

    boolean n1(boolean z7, int i7);

    void o0();

    void o1(String str, com.google.android.gms.common.util.o oVar);

    void onPause();

    void onResume();

    w2.a p();

    void p1(boolean z7);

    boolean q0();

    void q1(boolean z7);

    void r0();

    void r1(boolean z7);

    ot0 s0();

    void s1(String str, y50 y50Var);

    @Override // com.google.android.gms.internal.ads.bo0
    void setBackgroundColor(int i7);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    f03 t0();

    void u0();

    u2.a0 v0();

    vs x0();

    void z0(String str, qp0 qp0Var);
}
