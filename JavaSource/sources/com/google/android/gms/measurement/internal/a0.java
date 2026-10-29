package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class a0 extends a8 {

    /* renamed from: c, reason: collision with root package name */
    private long f21836c;

    /* renamed from: d, reason: collision with root package name */
    private String f21837d;

    a0(w6 w6Var) {
        super(w6Var);
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f21836c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f21837d = sb.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f21836c;
    }

    public final String p() {
        l();
        return this.f21837d;
    }
}
