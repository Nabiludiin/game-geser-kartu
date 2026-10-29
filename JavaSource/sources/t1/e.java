package t1;

import android.app.Activity;
import android.content.SharedPreferences;
import com.nabil.R;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f26355a;

    /* renamed from: b, reason: collision with root package name */
    SharedPreferences.Editor f26356b;

    /* renamed from: c, reason: collision with root package name */
    private i f26357c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f26358d;

    /* renamed from: e, reason: collision with root package name */
    private int f26359e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26360f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26361g = false;

    public e(Activity activity) {
        this.f26358d = activity;
        this.f26355a = activity.getSharedPreferences("SharedPref", 0);
        this.f26357c = new i(activity);
        this.f26359e = 0;
        if (this.f26355a.getInt("TOTAL_DEATH", 0) == 1) {
            this.f26359e = 15;
        }
        if (this.f26355a.getInt("TOTAL_DEATH", 0) > 3) {
            this.f26359e = 30;
        }
    }

    private void d() {
        SharedPreferences.Editor edit = this.f26355a.edit();
        this.f26356b = edit;
        edit.putBoolean("SHOW_ENDING", false);
        this.f26356b.putInt("TIME", 0);
        this.f26356b.putBoolean("SP_QUEST_1", false);
        this.f26356b.putBoolean("MESSAGES_ERASED", true);
        this.f26356b.putBoolean("MESSAGES_SEEN", false);
        this.f26356b.putBoolean("PHONE_LOST", false);
        this.f26356b.putInt("TIME_RESEARCH_LEVEL", 0);
        this.f26356b.putBoolean("GOVERNOR_SEEN", false);
        this.f26356b.putBoolean("GOVERNOR_UNMASKED", false);
        this.f26356b.putBoolean("PROJECT_STOLEN", false);
        this.f26356b.putBoolean("HOME_MOVING", false);
        this.f26356b.putBoolean("PROJECT_FOUND", false);
        this.f26356b.putBoolean("PRESIDENT_REVEALED", false);
        this.f26356b.putBoolean("CHURCH_REFOUND", false);
        this.f26356b.putBoolean("COMBINED_TIME_RESEARCH", false);
        this.f26356b.putBoolean("SECOND_MESSAGE", false);
        this.f26356b.putBoolean("THIRD_MESSAGE", false);
        this.f26356b.putBoolean("WIFE_DONE", false);
        this.f26356b.commit();
        ArrayList c8 = this.f26357c.c("MySpecialYears", Integer.class);
        c8.clear();
        this.f26357c.e("MySpecialYears", c8);
        ArrayList c9 = this.f26357c.c("MyEffects", f.class);
        c9.clear();
        this.f26357c.e("MyEffects", c9);
    }

    public g a(int i7) {
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        g gVar5;
        g gVar6;
        g gVar7;
        g gVar8;
        g gVar9;
        int i8 = this.f26359e;
        switch (i8) {
            case 0:
                gVar = new g(1, R.string.unknown_character, R.string.intro_1, R.drawable.character_20, R.string.intro_1_l, R.string.intro_1_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar5 = gVar;
                break;
            case 1:
                if (i7 != 0) {
                    gVar2 = new g(3, R.string.unknown_character, R.string.intro_3, R.drawable.character_20, R.string.intro_3_l, R.string.intro_3_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar2;
                    break;
                } else {
                    gVar3 = new g(2, R.string.unknown_character, R.string.intro_2, R.drawable.character_20, R.string.intro_2_l, R.string.intro_2_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar3;
                    break;
                }
            case 2:
                gVar4 = new g(4, R.string.unknown_character, R.string.intro_4, R.drawable.character_20, R.string.intro_4_l, R.string.intro_4_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar5 = gVar4;
                break;
            case 3:
                if (i7 != 0) {
                    gVar5 = new g(5, R.string.unknown_character, R.string.intro_5, R.drawable.character_20, R.string.intro_5_l, R.string.intro_5_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    break;
                } else {
                    gVar6 = new g(4, R.string.unknown_character, R.string.intro_4, R.drawable.character_20, R.string.intro_4_l, R.string.intro_4_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar6;
                    break;
                }
            case 4:
                if (i7 != 0) {
                    gVar7 = new g(7, R.string.unknown_character, R.string.intro_7, R.drawable.character_20, R.string.intro_7_l, R.string.intro_7_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar7;
                    break;
                } else {
                    gVar8 = new g(6, R.string.unknown_character, R.string.intro_6, R.drawable.character_20, R.string.intro_6_l, R.string.intro_6_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar8;
                    break;
                }
            case 5:
                if (i7 != 0) {
                    gVar9 = new g(7, R.string.unknown_character, R.string.intro_7, R.drawable.character_20, R.string.intro_7_l, R.string.intro_7_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar9;
                    break;
                } else {
                    gVar = new g(6, R.string.unknown_character, R.string.intro_6, R.drawable.character_20, R.string.intro_6_l, R.string.intro_6_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar;
                    break;
                }
            case 6:
                if (i7 != 0) {
                    gVar2 = new g(8, R.string.unknown_character, R.string.intro_8, R.drawable.character_20, R.string.intro_8_l, R.string.intro_8_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar2;
                    break;
                } else {
                    gVar3 = new g(10, R.string.unknown_character, R.string.intro_10, R.drawable.character_20, R.string.intro_10_l, R.string.intro_10_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar3;
                    break;
                }
            case 7:
                if (i7 != 0) {
                    gVar4 = new g(9, R.string.unknown_character, R.string.intro_9, R.drawable.character_20, R.string.intro_9_l, R.string.intro_9_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar4;
                    break;
                } else {
                    gVar5 = new g(6, R.string.unknown_character, R.string.intro_6, R.drawable.character_20, R.string.intro_6_l, R.string.intro_6_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    break;
                }
            case 8:
                if (i7 != 0) {
                    gVar6 = new g(10, R.string.unknown_character, R.string.intro_10, R.drawable.character_20, R.string.intro_10_l, R.string.intro_10_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar6;
                    break;
                } else {
                    gVar7 = new g(14, R.string.unknown_character, R.string.intro_8, R.drawable.event_text_card, R.string.card_intro_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    this.f26360f = true;
                    SharedPreferences.Editor edit = this.f26355a.edit();
                    this.f26356b = edit;
                    edit.putBoolean("FIRST_INTRO_FINISHED", true);
                    this.f26356b.apply();
                    gVar5 = gVar7;
                    break;
                }
            case 9:
                if (i7 != 0) {
                    gVar = new g(8, R.string.unknown_character, R.string.intro_8, R.drawable.character_20, R.string.intro_8_l, R.string.intro_8_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar;
                    break;
                } else {
                    gVar2 = new g(10, R.string.unknown_character, R.string.intro_10, R.drawable.character_20, R.string.intro_10_l, R.string.intro_10_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar2;
                    break;
                }
            case 10:
                if (i7 != 0) {
                    gVar3 = new g(8, R.string.unknown_character, R.string.intro_8, R.drawable.character_20, R.string.intro_8_l, R.string.intro_8_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar3;
                    break;
                } else {
                    gVar4 = new g(11, R.string.unknown_character, R.string.intro_11, R.drawable.character_20, R.string.intro_11_l, R.string.intro_11_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                    gVar5 = gVar4;
                    break;
                }
            case 11:
                gVar5 = new g(12, R.string.unknown_character, R.string.intro_12, R.drawable.character_20, R.string.intro_12_l, R.string.intro_12_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                break;
            case 12:
                gVar6 = new g(13, R.string.unknown_character, R.string.intro_13, R.drawable.character_20, R.string.intro_13_l, R.string.intro_13_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar5 = gVar6;
                break;
            case 13:
                gVar7 = new g(14, R.string.unknown_character, R.string.intro_8, R.drawable.event_text_card, R.string.card_intro_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                this.f26360f = true;
                SharedPreferences.Editor edit2 = this.f26355a.edit();
                this.f26356b = edit2;
                edit2.putBoolean("FIRST_INTRO_FINISHED", true);
                this.f26356b.apply();
                gVar5 = gVar7;
                break;
            default:
                switch (i8) {
                    case 15:
                        gVar8 = new g(16, R.string.unknown_character, R.string.intro_16, R.drawable.character_20, R.string.intro_16_l, R.string.intro_16_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                        gVar5 = gVar8;
                        break;
                    case 16:
                        gVar9 = new g(17, R.string.unknown_character, R.string.intro_17, R.drawable.character_20, R.string.intro_17_l, R.string.intro_17_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                        gVar5 = gVar9;
                        break;
                    case 17:
                        gVar = new g(18, R.string.unknown_character, R.string.intro_18, R.drawable.character_20, R.string.intro_18_l, R.string.intro_18_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                        gVar5 = gVar;
                        break;
                    case 18:
                        if (i7 != 0) {
                            gVar2 = new g(19, R.string.unknown_character, R.string.intro_19, R.drawable.character_20, R.string.intro_19_l, R.string.intro_19_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                            gVar5 = gVar2;
                            break;
                        } else {
                            gVar3 = new g(20, R.string.unknown_character, R.string.intro_20, R.drawable.character_20, R.string.intro_20_l, R.string.intro_20_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                            gVar5 = gVar3;
                            break;
                        }
                    case 19:
                        gVar4 = new g(21, R.string.unknown_character, R.string.intro_19, R.drawable.event_text_card, R.string.card_intro_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                        this.f26360f = true;
                        SharedPreferences.Editor edit3 = this.f26355a.edit();
                        this.f26356b = edit3;
                        edit3.putBoolean("SECOND_INTRO_FINISHED", true);
                        this.f26356b.apply();
                        gVar5 = gVar4;
                        break;
                    case 20:
                        gVar5 = new g(21, R.string.unknown_character, R.string.intro_20, R.drawable.event_text_card, R.string.card_intro_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                        this.f26360f = true;
                        SharedPreferences.Editor edit4 = this.f26355a.edit();
                        this.f26356b = edit4;
                        edit4.putBoolean("SECOND_INTRO_FINISHED", true);
                        this.f26356b.apply();
                        break;
                    default:
                        switch (i8) {
                            case 30:
                                gVar9 = new g(31, R.string.creator, R.string.intro_31, R.drawable.creator, R.string.intro_31_l, R.string.intro_31_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                gVar5 = gVar9;
                                break;
                            case 31:
                                gVar = new g(32, R.string.creator, R.string.intro_32, R.drawable.creator, R.string.intro_32_l, R.string.intro_32_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                gVar5 = gVar;
                                break;
                            case 32:
                                gVar2 = new g(33, R.string.creator, R.string.intro_33, R.drawable.creator, R.string.intro_33_l, R.string.intro_33_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                gVar5 = gVar2;
                                break;
                            case 33:
                                gVar3 = new g(34, R.string.creator, R.string.intro_34, R.drawable.creator, R.string.intro_34_l, R.string.intro_34_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                gVar5 = gVar3;
                                break;
                            case 34:
                                gVar4 = new g(35, R.string.creator, R.string.intro_34, R.drawable.back_card, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                this.f26360f = true;
                                this.f26361g = true;
                                d();
                                gVar5 = gVar4;
                                break;
                            default:
                                gVar5 = new g(14, R.string.unknown_character, R.string.empty_string, R.drawable.event_text_card, R.string.card_intro_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                this.f26360f = true;
                                SharedPreferences.Editor edit5 = this.f26355a.edit();
                                this.f26356b = edit5;
                                edit5.putBoolean("FIRST_INTRO_FINISHED", true);
                                this.f26356b.putBoolean("SECOND_INTRO_FINISHED", true);
                                this.f26356b.putBoolean("SHOW_ENDING", false);
                                this.f26356b.apply();
                                break;
                        }
                }
        }
        this.f26359e = gVar5.j();
        return gVar5;
    }

    public boolean b() {
        return this.f26361g;
    }

    public boolean c() {
        return this.f26360f;
    }
}
