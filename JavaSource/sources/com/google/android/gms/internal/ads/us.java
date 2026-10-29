package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MyApplication */
public final class us {

    /* renamed from: a, reason: collision with root package name */
    private final js f16945a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16946b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16947c;

    public us(int i7, int i8, int i9) {
        this.f16946b = i7;
        i8 = (i8 > 64 || i8 < 0) ? 64 : i8;
        if (i9 <= 0) {
            this.f16947c = 1;
        } else {
            this.f16947c = i9;
        }
        this.f16945a = new ss(i8);
    }

    public final String a(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new ts(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((is) arrayList2.get(i7)).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i8 = 1;
                        boolean z7 = false;
                        while (true) {
                            int i9 = i8 + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i8) == '\'') {
                                if (sb.charAt(i8 - 1) != ' ') {
                                    int i10 = i8 + 1;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(i8, ' ');
                                        i8 = i9;
                                        z7 = true;
                                    }
                                }
                                sb.setCharAt(i8, ' ');
                                z7 = true;
                            }
                            i8++;
                        }
                        String sb2 = z7 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    String[] b8 = os.b(str, true);
                    int length = b8.length;
                    int i11 = this.f16947c;
                    if (length >= i11) {
                        for (int i12 = 0; i12 < b8.length; i12++) {
                            String str2 = "";
                            for (int i13 = 0; i13 < i11; i13++) {
                                int i14 = i12 + i13;
                                if (i14 >= b8.length) {
                                    break;
                                }
                                if (i13 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(b8[i14]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.f16946b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f16946b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ls lsVar = new ls();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                lsVar.f11763b.write(this.f16945a.a((String) it.next()));
            } catch (IOException e8) {
                int i15 = v2.n1.f26802b;
                w2.p.d("Error while writing hash to byteStream", e8);
            }
        }
        return lsVar.toString();
    }
}
