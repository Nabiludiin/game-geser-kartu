package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
final class e extends ad {

    /* renamed from: d, reason: collision with root package name */
    private String f22071d;

    /* renamed from: e, reason: collision with root package name */
    private Set f22072e;

    /* renamed from: f, reason: collision with root package name */
    private Map f22073f;

    /* renamed from: g, reason: collision with root package name */
    private Long f22074g;

    /* renamed from: h, reason: collision with root package name */
    private Long f22075h;

    e(pd pdVar) {
        super(pdVar);
    }

    private final he n(Integer num) {
        if (this.f22073f.containsKey(num)) {
            return (he) this.f22073f.get(num);
        }
        he heVar = new he(this, this.f22071d, null);
        this.f22073f.put(num, heVar);
        return heVar;
    }

    private final boolean o(int i7, int i8) {
        he heVar = (he) this.f22073f.get(Integer.valueOf(i7));
        if (heVar == null) {
            return false;
        }
        return heVar.c().get(i8);
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|(2:4|(2:6|7)(1:538))(2:539|540))|8|(3:10|11|12)|16|(7:19|20|21|22|23|(14:(7:25|26|27|28|(1:30)(3:512|(1:514)(1:516)|515)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:468|(6:469|470|471|472|473|(1:476)(1:475))|477)|44|(5:297|(11:299|300|301|302|303|(1:(4:305|(1:307)|308|309))(1:451)|312|313|(3:407|(6:410|(2:446|447)(2:414|(8:420|421|(4:424|(2:426|427)(1:429)|428|422)|430|431|(4:434|(3:436|437|438)(1:440)|439|432)|441|442)(4:416|417|418|419))|443|444|419|408)|449)|315|316)(1:467)|317|(11:320|(3:324|(4:327|(5:329|330|(1:332)(1:336)|333|334)(1:337)|335|325)|338)|339|340|(3:344|(4:347|(3:352|353|354)|355|345)|358)|359|(3:361|(6:364|(2:366|(3:368|369|370))(1:373)|371|372|370|362)|374)|375|(3:384|(8:387|(1:389)|390|(1:392)|393|(2:395|396)(1:398)|397|385)|399)|400|318)|406)|46|47|(3:49|(4:52|(3:54|55|(8:57|58|(10:60|61|62|63|64|65|66|67|(3:69|(11:70|71|72|73|74|75|76|(3:78|79|80)(1:133)|81|82|(1:85)(1:84))|86)(3:140|141|142)|87)(1:157)|88|(4:91|(3:109|110|111)(6:93|94|(2:95|(2:97|(1:99)(2:100|101))(2:107|108))|(1:103)|104|105)|106|89)|112|113|114)(1:158))(1:159)|115|50)|160)|(6:162|(3:164|(6:167|(6:169|170|171|172|173|(3:(9:175|176|177|178|179|(3:181|182|183)(1:244)|184|185|(1:188)(1:187))|189|190)(4:251|252|240|190))(1:268)|191|(2:192|(2:194|(3:231|232|233)(8:196|(2:197|(4:199|(4:201|(1:203)(1:227)|204|205)(1:228)|206|(1:1)(2:210|(1:212)(2:213|214)))(2:229|230))|221|(1:223)(1:225)|224|216|217|218))(0))|234|165)|269)|270|(10:273|274|275|276|277|278|280|(3:282|283|284)(1:286)|285|271)|293|294)(2:295|296))|521)|537|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|(0)(0)|(5:(0)|(1:526)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0997, code lost:
    
        if (r12 != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0878, code lost:
    
        if (r13 != null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x02e5, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x01b3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x01b4, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x01b6, code lost:
    
        r18 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0225, code lost:
    
        r17 = r2;
        r18 = "data";
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x022f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x022c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0168, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:468:0x01bc, B:469:0x01c1, B:471:0x01cb, B:472:0x01db, B:473:0x0207, B:486:0x01ea, B:491:0x01fa, B:494:0x0200, B:480:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:468:0x01bc, B:469:0x01c1, B:471:0x01cb, B:472:0x01db, B:473:0x0207, B:486:0x01ea, B:491:0x01fa, B:494:0x0200, B:480:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06ed  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List m(java.lang.String r35, java.util.List r36, java.util.List r37, java.lang.Long r38, java.lang.Long r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 2644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }
}
