package com.yawjalik.steinsboard;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.view.View;
import android.widget.Button;

public class SoundPoolManager {
    public static SoundPool soundPool;
    private Context context;
    private static SoundPoolManager instance = null;

    /***** OKABE *****/
    private static int laugh001, laugh002, laugh003, laugh004, laugh006, zombi001, zombi002, zombi003,
            huhahuha, heyMister, madScientist, madScientist002, madScientist003, soCool, sonuvabich,
            agent, doctor, damare, christinadet, beetch, partTime, nostalgia, keikaku, farewell,
            christina001, christina002, christina003, christina004, christina005, christina006,
            assistant001, assistant002, assistant003, assistant004, assistant005, assistant006,
            genius001, genius002, genius003, genius004, genius005, genius006,
            kyouma001, kyouma002, kyouma003, elpsykongroo, channeler2, myfavoriterightarm,
            dagaotokoda, shiningfinger, expand;

    /***** MAYUSHII *****/
    private static int tuturu1, tuturu2, tuturu3, tuturu4, tuturu5, tuturu6,
            karaage001, karaage002, sugoine, gelbana, metalUpa, okarin1, okarin2, watch, kurisuchan;

    /***** DARU *****/
    private static int gentleman, daruThing, farisTan, chuunibyou, cheapass, hakka, hakka2, scream1, scream2,
            tsundere1, tsundere2, banana;

    /***** KURISU *****/
    private static int kurisuLaugh, cel7, channeler, christina, hououinsan, wrong, tina, tsundere, surprised;

    /*** MOEKA ***/
    private static int message;

    /*** LUKAKO ***/

    /*** FARIS ***/
    private static int nyan1, nyan2;

    /*** SUZUHA ***/
    private static int ohaaa, ohaaa2, cheesu, wheesu, okeydokey1, okeydokey2;

    /*** MAHO ***/

    private void initSound()
    {
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(1)
                .setAudioAttributes(audioAttributes)
                .build();
    }

    private SoundPoolManager(Context context)
    {
        this.context = context;
        initSound();

        /***** OKABE *****/
        laugh001 = soundPool.load(context, R.raw.laugh001, 1);
        laugh002 = soundPool.load(context, R.raw.laugh002, 1);
        laugh003 = soundPool.load(context, R.raw.laugh003, 1);
        laugh004 = soundPool.load(context, R.raw.laugh004, 1);
        huhahuha = soundPool.load(context, R.raw.huhahuha, 1);
        laugh006 = soundPool.load(context, R.raw.laugh006, 1);
        christina001 = soundPool.load(context, R.raw.christina001, 1);
        christina002 = soundPool.load(context, R.raw.christina002, 1);
        christina003 = soundPool.load(context, R.raw.christina003, 1);
        christina004 = soundPool.load(context, R.raw.christina004, 1);
        christina005 = soundPool.load(context, R.raw.christina005, 1);
        christina006 = soundPool.load(context, R.raw.christina006, 1);
        assistant001 = soundPool.load(context, R.raw.assistant001, 1);
        assistant002 = soundPool.load(context, R.raw.assistant002, 1);
        assistant003 = soundPool.load(context, R.raw.assistant003, 1);
        assistant004 = soundPool.load(context, R.raw.assistant004, 1);
        assistant005 = soundPool.load(context, R.raw.assistant005, 1);
        assistant006 = soundPool.load(context, R.raw.assistant006, 1);
        genius001 = soundPool.load(context, R.raw.genius001, 1);
        genius002 = soundPool.load(context, R.raw.genius002, 1);
        genius003 = soundPool.load(context, R.raw.genius003, 1);
        genius004 = soundPool.load(context, R.raw.genius004, 1);
        genius005 = soundPool.load(context, R.raw.genius005, 1);
        genius006 = soundPool.load(context, R.raw.genius006, 1);
        zombi001 = soundPool.load(context, R.raw.zombie1, 1);
        zombi002 = soundPool.load(context, R.raw.zombie2, 1);
        zombi003 = soundPool.load(context, R.raw.zombie3, 1);
        kyouma001 = soundPool.load(context, R.raw.kyouma001, 1);
        kyouma002 = soundPool.load(context, R.raw.kyouma002, 1);
        kyouma003 = soundPool.load(context, R.raw.kyouma003, 1);
        heyMister = soundPool.load(context, R.raw.heymister, 1);
        madScientist = soundPool.load(context, R.raw.madscientist, 1);
        madScientist002 = soundPool.load(context, R.raw.madscientist002, 1);
        madScientist003 = soundPool.load(context, R.raw.madscientist003, 1);
        soCool = soundPool.load(context, R.raw.socool, 1);
        sonuvabich = soundPool.load(context, R.raw.sonuvabich, 1);
        dagaotokoda = soundPool.load(context, R.raw.dagaotokoda, 1);
        shiningfinger = soundPool.load(context, R.raw.shiningfinger, 1);
        expand = soundPool.load(context, R.raw.expand, 1);
        elpsykongroo = soundPool.load(context, R.raw.elpsykongroo, 1);
        channeler2 = soundPool.load(context, R.raw.channeler2, 1);
        myfavoriterightarm = soundPool.load(context, R.raw.myfavoriterightarm, 1);
        agent = soundPool.load(context, R.raw.agent, 1);
        doctor = soundPool.load(context, R.raw.doctor, 1);
        damare = soundPool.load(context, R.raw.damare, 1);
        christinadet = soundPool.load(context, R.raw.christinadet, 1);
        beetch = soundPool.load(context, R.raw.beetch, 1);
        keikaku = soundPool.load(context, R.raw.keikaku, 1);
        partTime = soundPool.load(context, R.raw.part_time, 1);
        nostalgia = soundPool.load(context, R.raw.nostalgia_drive, 1);
        farewell = soundPool.load(context, R.raw.farewell, 1);


        /***** MAYUSHII *****/
        tuturu1 = soundPool.load(context, R.raw.tuturu, 1);
        tuturu2 = soundPool.load(context, R.raw.tuturu2, 1);
        tuturu3 = soundPool.load(context, R.raw.tuturu3, 1);
        tuturu4 = soundPool.load(context, R.raw.tuturu4, 1);
        tuturu5 = soundPool.load(context, R.raw.tuturu5, 1);
        tuturu6 = soundPool.load(context, R.raw.tuturu6, 1);
        karaage001 = soundPool.load(context, R.raw.karaage, 1);
        karaage002 = soundPool.load(context, R.raw.karaage2, 1);
        sugoine = soundPool.load(context, R.raw.sugoine, 1);
        gelbana = soundPool.load(context, R.raw.gelbana, 1);
        metalUpa = soundPool.load(context, R.raw.metal_upa, 1);
        okarin1 = soundPool.load(context, R.raw.okarin1, 1);
        okarin2 = soundPool.load(context, R.raw.okarin2, 1);
        watch = soundPool.load(context, R.raw.watch, 1);
        kurisuchan = soundPool.load(context, R.raw.kurisuchan, 1);

        /***** DARU *****/
        gentleman = soundPool.load(context, R.raw.gentleman, 1);
        daruThing = soundPool.load(context, R.raw.daru_thing, 1);
        farisTan = soundPool.load(context, R.raw.faris_tan, 1);
        chuunibyou = soundPool.load(context, R.raw.chuunibyou, 1);
        cheapass = soundPool.load(context, R.raw.cheapass, 1);
        hakka = soundPool.load(context, R.raw.hakka, 1);
        hakka2 = soundPool.load(context, R.raw.hakka2, 1);
        scream1 = soundPool.load(context, R.raw.scream1, 1);
        scream2 = soundPool.load(context, R.raw.scream2, 1);
        tsundere1 = soundPool.load(context, R.raw.tsundere1, 1);
        tsundere2 = soundPool.load(context, R.raw.tsundere2, 1);
        banana = soundPool.load(context, R.raw.banana, 1);

        /***** KURISU *****/
        kurisuLaugh = soundPool.load(context, R.raw.kurisu_laugh, 1);
        cel7 = soundPool.load(context, R.raw.cel7, 1);
        channeler = soundPool.load(context, R.raw.channeler, 1);
        christina = soundPool.load(context, R.raw.christina, 1);
        hououinsan = soundPool.load(context, R.raw.hououinsan, 1);
        wrong = soundPool.load(context, R.raw.no, 1);
        tina = soundPool.load(context, R.raw.tina, 1);
        tsundere = soundPool.load(context, R.raw.tsundere, 1);
        surprised = soundPool.load(context, R.raw.surprised, 1);

        /*** MOEKA ***/
        message = soundPool.load(context, R.raw.message, 1);

        /*** RUKAKO ***/

        /*** FARIS ***/
        nyan1 = soundPool.load(context, R.raw.nyan1, 1);
        nyan2 = soundPool.load(context, R.raw.nyan2, 1);

        /*** SUZUHA ***/
        ohaaa = soundPool.load(context, R.raw.ohaaa, 1);
        ohaaa2 = soundPool.load(context, R.raw.ohaaa2, 1);
        cheesu = soundPool.load(context, R.raw.cheesu, 1);
        wheesu = soundPool.load(context, R.raw.wheesu, 1);
        okeydokey1 = soundPool.load(context, R.raw.okeydokey1, 1);
        okeydokey2 = soundPool.load(context, R.raw.okeydokey2, 1);
    }

    public static void instantiate(Context context)
    {
        if (instance == null)
        {
            instance = new SoundPoolManager(context);
        }

    }

    public static void playSound(View v) {
        switch (v.getId()) {
            /*** OKARIN ***/
            case R.id.bLaugh001:
                soundPool.play(laugh001, 1, 1, 0, 0, 1);
                break;

            case R.id.bLaugh002:
                soundPool.play(laugh002, 1, 1, 0, 0, 1);
                break;

            case R.id.bLaugh003:
                soundPool.play(laugh003, 1, 1, 0, 0, 1);
                break;

            case R.id.bLaugh004:
                soundPool.play(laugh004, 1, 1, 0, 0, 1);
                break;

            case R.id.bLaugh005:
                soundPool.play(huhahuha, 1, 1, 0, 0, 1);
                break;

            case R.id.bLaugh006:
                soundPool.play(laugh006, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina001:
                soundPool.play(christina001, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina002:
                soundPool.play(christina002, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina003:
                soundPool.play(christina003, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina004:
                soundPool.play(christina004, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina005:
                soundPool.play(christina005, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina006:
                soundPool.play(christina006, 1, 1, 0, 0, 1);
                break;

            case R.id.bAssistant001:
                soundPool.play(assistant001, 1, 1, 0, 0, 1);
                break;

            case R.id.bAssistant002:
                soundPool.play(assistant002, 1, 1, 0, 0, 1);
                break;

            case R.id.bAssistant003:
                soundPool.play(assistant003, 1, 1, 0, 0, 1);
                break;

            case R.id.bAssistant004:
                soundPool.play(assistant004, 1, 1, 0, 0, 1);
                break;

            case R.id.bAssistant005:
                soundPool.play(assistant005, 1, 1, 0, 0, 1);
                break;

            case R.id.bAssistant006:
                soundPool.play(assistant006, 1, 1, 0, 0, 1);
                break;

            case R.id.bGenius001:
                soundPool.play(genius001, 1, 1, 0, 0, 1);
                break;

            case R.id.bGenius002:
                soundPool.play(genius002, 1, 1, 0, 0, 1);
                break;

            case R.id.bGenius003:
                soundPool.play(genius003, 1, 1, 0, 0, 1);
                break;

            case R.id.bGenius004:
                soundPool.play(genius004, 1, 1, 0, 0, 1);
                break;

            case R.id.bGenius005:
                soundPool.play(genius005, 1, 1, 0, 0, 1);
                break;

            case R.id.bGenius006:
                soundPool.play(genius006, 1, 1, 0, 0, 1);
                break;

            case R.id.bZombie001:
                soundPool.play(zombi001, 1, 1, 0, 0, 1);
                break;

            case R.id.bZombie002:
                soundPool.play(zombi002, 1, 1, 0, 0, 1);
                break;

            case R.id.bZombie003:
                soundPool.play(zombi003, 1, 1, 0, 0, 1);
                break;

            case R.id.bKyouma001:
                soundPool.play(kyouma001, 1, 1, 0, 0, 1);
                break;

            case R.id.bKyouma002:
                soundPool.play(kyouma002, 1, 1, 0, 0, 1);
                break;

            case R.id.bKyouma003:
                soundPool.play(kyouma003, 1, 1, 0, 0, 1);
                break;

            case R.id.bKeikaku:
                soundPool.play(keikaku, 1, 1, 0, 0, 1);
                break;

            case R.id.bFarewell:
                soundPool.play(farewell, 1, 1, 0, 0, 1);
                break;

            case R.id.bHeyMister:
                soundPool.play(heyMister, 1, 1, 0, 0, 1);
                break;

            case R.id.bMadScientist:
                soundPool.play(madScientist, 1, 1, 0, 0, 1);
                break;

            case R.id.bMadScientist002:
                soundPool.play(madScientist002, 1, 1, 0, 0, 1);
                break;

            case R.id.bMadScientist003:
                soundPool.play(madScientist003, 1, 1, 0, 0, 1);
                break;

            case R.id.bSoCool:
                soundPool.play(soCool, 1, 1, 0, 0, 1);
                break;

            case R.id.bSonuvabich:
                soundPool.play(sonuvabich, 1, 1, 0, 0, 1);
                break;

            case R.id.bDagaotokoda:
                Button b = (Button) v;
                b.setText("DAGA OTOKO DA");
                soundPool.play(dagaotokoda, 1, 1, 0, 0, 1);
                break;

            case R.id.bShiningFinger:
                soundPool.play(shiningfinger, 1, 1, 0, 0, 1);
                break;

            case R.id.bExpand:
                soundPool.play(expand, 1, 1, 0, 0, 1);
                break;

            case R.id.bElPsyKongroo:
                soundPool.play(elpsykongroo, 1, 1, 0, 0, 1);
                break;

            case R.id.bChanneler2:
                soundPool.play(channeler2, 1, 1, 0, 0, 1);
                break;

            case R.id.bMyFavoriteRightArm:
                soundPool.play(myfavoriterightarm, 1, 1, 0, 0, 1);
                break;

            case R.id.bAgent:
                soundPool.play(agent, 1, 1, 0, 0, 1);
                break;

            case R.id.bDoctor:
                soundPool.play(doctor, 1, 1, 0, 0, 1);
                break;

            case R.id.bDamare:
                soundPool.play(damare, 1, 1, 0, 0, 1);
                break;

            case R.id.bBeetch:
                soundPool.play(beetch, 1, 1, 0, 0, 1);
                break;

            case R.id.bPartTime:
                soundPool.play(partTime, 1, 1, 0, 0, 1);
                break;

            case R.id.bNostalgia:
                soundPool.play(nostalgia, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristinadet:
                soundPool.play(christinadet, 1, 1, 0, 0, 1);
                break;


            /*** MAYUSHII ***/
            case R.id.bTuturu1:
                soundPool.play(tuturu1, 1, 1, 0, 0, 1);
                break;

            case R.id.bTuturu2:
                soundPool.play(tuturu2, 1, 1, 0, 0, 1);
                break;

            case R.id.bTuturu3:
                soundPool.play(tuturu3, 1, 1, 0, 0, 1);
                break;

            case R.id.bTuturu4:
                soundPool.play(tuturu4, 1, 1, 0, 0, 1);
                break;

            case R.id.bTuturu5:
                soundPool.play(tuturu5, 1, 1, 0, 0, 1);
                break;

            case R.id.bTuturu6:
                soundPool.play(tuturu6, 1, 1, 0, 0, 1);
                break;

            case R.id.bKaraage001:
                soundPool.play(karaage001, 1, 1, 0, 0, 1);
                break;

            case R.id.bSugoine:
                soundPool.play(sugoine, 1, 1, 0, 0, 1);
                break;

            case R.id.bGelbana:
                soundPool.play(gelbana, 1, 1, 0, 0, 1);
                break;

            case R.id.bMetalUpa:
                soundPool.play(metalUpa, 1, 1, 0, 0, 1);
                break;

            case R.id.bKaraage002:
                soundPool.play(karaage002, 1, 1, 0, 0, 1);
                break;

            case R.id.bOkarin1:
                soundPool.play(okarin1, 1, 1, 0, 0, 1);
                break;

            case R.id.bOkarin2:
                soundPool.play(okarin2, 1, 1, 0, 0, 1);
                break;

            case R.id.bWatch:
                soundPool.play(watch, 1, 1, 0, 0, 1);
                break;

            case R.id.bKurisuchan:
                soundPool.play(kurisuchan, 1, 1, 0, 0, 1);
                break;

            /*** DARU ***/
            case R.id.bGentleman:
                soundPool.play(gentleman, 1, 1, 0, 0, 1);
                break;

            case R.id.bDaruThing:
                soundPool.play(daruThing, 1, 1, 0, 0, 1);
                break;

            case R.id.bFarisTan:
                soundPool.play(farisTan, 1, 1, 0, 0, 1);
                break;

            case R.id.bChuunibyou:
                soundPool.play(chuunibyou, 1, 1, 0, 0, 1);
                break;

            case R.id.bCheapass:
                soundPool.play(cheapass, 1, 1, 0, 0, 1);
                break;

            case R.id.bHakka:
                soundPool.play(hakka, 1, 1, 0, 0, 1);
                break;

            case R.id.bHakka2:
                soundPool.play(hakka2, 1, 1, 0, 0, 1);
                break;

            case R.id.bScream1:
                soundPool.play(scream1, 1, 1, 0, 0, 1);
                break;

            case R.id.bScream2:
                soundPool.play(scream2, 1, 1, 0, 0, 1);
                break;

            case R.id.bTsundere1:
                soundPool.play(tsundere1, 1, 1, 0, 0, 1);
                break;

            case R.id.bTsundere2:
                soundPool.play(tsundere2, 1, 1, 0, 0, 1);
                break;

            case R.id.bBanana:
                soundPool.play(banana, 1, 1, 0, 0, 1);
                break;

            /*** KURISU ***/
            case R.id.bKurisuLaugh:
                soundPool.play(kurisuLaugh, 1, 1, 0, 0, 1);
                break;

            case R.id.bCel7:
                soundPool.play(cel7, 1, 1, 0, 0, 1);
                break;

            case R.id.bChanneler:
                soundPool.play(channeler, 1, 1, 0, 0, 1);
                break;

            case R.id.bChristina:
                soundPool.play(christina, 1, 1, 0, 0, 1);
                break;

            case R.id.bTina:
                soundPool.play(tina, 1, 1, 0, 0, 1);
                break;

            case R.id.bHououinSan:
                soundPool.play(hououinsan, 1, 1, 0, 0, 1);
                break;

            case R.id.bTsundere:
                soundPool.play(tsundere, 1, 1, 0, 0, 1);
                break;

            case R.id.bWrong:
                soundPool.play(wrong, 1, 1, 0, 0, 1);
                break;

            case R.id.bSurprised:
                soundPool.play(surprised, 1, 1, 0, 0, 1);
                break;

            /*** MOEKA ***/
            case R.id.bK1: case R.id.bK2: case R.id.bK3: case R.id.bK4: case R.id.bK5: case R.id.bIbn5100:
                soundPool.play(message, 1, 1, 0, 0, 1);
                break;

            /*** LUKAKO ***/
            case R.id.bDagaotokoda2:
                Button bb = (Button) v;
                bb.setText("DAGA OTOKO DA");
                bb.setTextSize(20);
                soundPool.play(dagaotokoda, 1, 1, 0, 0, 1);
                break;

            /*** FARIS ***/
            case R.id.bNyan1:
                soundPool.play(nyan1, 1, 1, 0, 0, 1);
                break;
            case R.id.bNyan2:
                soundPool.play(nyan2, 1, 1, 0, 0, 1);
                break;

            /*** SUZUHA ***/
            case R.id.bOhaaa:
                soundPool.play(ohaaa, 1, 1, 0, 0, 1);
                break;

            case R.id.bOhaaa2:
                soundPool.play(ohaaa2, 1, 1, 0, 0, 1);
                break;

            case R.id.bCheesu:
                soundPool.play(cheesu, 1, 1, 0, 0, 1);
                break;

            case R.id.bWheesu:
                soundPool.play(wheesu, 1, 1, 0, 0, 1);
                break;

            case R.id.bOkeyDokey1:
                soundPool.play(okeydokey1, 1, 1, 0, 0, 1);
                break;

            case R.id.bOkeyDokey2:
                soundPool.play(okeydokey2, 1, 1, 0, 0, 1);
                break;
        }
    }

    public static void cleanUp()
    {
        if (soundPool != null)
        {
            soundPool.release();
            soundPool = null;
        }
    }


}
