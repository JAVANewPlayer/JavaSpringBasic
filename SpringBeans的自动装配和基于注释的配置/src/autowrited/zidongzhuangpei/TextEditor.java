package autowrited.zidongzhuangpei;
import org.springframework.beans.factory.annotation.Autowired;


//setter方法,构造函数、属性，任何一个设置Autowrited都可以自动关联

public class TextEditor {
//    @Autowired
//    private SpellChecker spellChecker;

    private SpellChecker spellChecker;

    @Autowired
    public TextEditor(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }


    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
//    @Autowired
//    public void setSpellChecker(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
