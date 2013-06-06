package com.example.plaid.pages
import org.apache.tapestry5.SymbolConstants
import org.apache.tapestry5.ioc.annotations.Inject
import org.apache.tapestry5.ioc.annotations.Symbol

class FieldBug
{

    @Inject
    @Symbol(SymbolConstants.PRODUCTION_MODE)
    boolean productionModeEnabled

    // workaround A -- change words field from 'private' to 'default' (no modifier) access
    private List<String> words

    // workaround B -- create a 'getter' method; as below
    //private List<String> getWords()
    //{
    //    return words
    //}

    // bug -- with ProductionMode enabled 'words' will be unexpectedly NULL inside the closure
    String getOutput()
    {
        words = []

        [ 'Apple', 'Banana', 'Grape', 'Orange' ].each {
            if (it == 'Grape') {
                words << 'Wine'
            }
            else {
                words << it
            }
        }

        return words.join('\n')
    }

}
