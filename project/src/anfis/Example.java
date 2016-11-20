/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anfis;

import com.fuzzylite.Engine;
import com.fuzzylite.Op;
import com.fuzzylite.rule.Rule;
import com.fuzzylite.rule.RuleBlock;
import com.fuzzylite.term.Triangle;
import com.fuzzylite.variable.InputVariable;
import com.fuzzylite.variable.OutputVariable;

public class Example {

    public  String data(double x){
        Engine engine = new Engine();
        engine.setName("simple-dimmer");

        InputVariable ambient = new InputVariable();
        ambient.setName("data");
        ambient.setRange(1.0,100.0);
        ambient.addTerm(new Triangle("face",75.0 , 80.0, 85.0));
        ambient.addTerm(new Triangle("iris", 90.0, 95.0, 100.0));
        ambient.addTerm(new Triangle("finger", 76.0, 86.0, 96.0));
        engine.addInputVariable(ambient);

        OutputVariable power = new OutputVariable();
        power.setName("match");
        power.setRange(1.0,100.0);
        power.setDefaultValue(Double.NaN);
        power.addTerm(new Triangle("LOW", 80.0 , 90.0, 95.0));
        power.addTerm(new Triangle("MEDIUM", 75.0, 80.0, 90.0));
        power.addTerm(new Triangle("HIGH", 75.0, 80.0, 90.0));
        engine.addOutputVariable(power);

        RuleBlock ruleBlock = new RuleBlock();
        ruleBlock.addRule(Rule.parse("if data is face then match is LOW", engine));
        ruleBlock.addRule(Rule.parse("if data is iris then match is MEDIUM", engine));
        ruleBlock.addRule(Rule.parse("if data is finger then match is HIGH", engine));
        engine.addRuleBlock(ruleBlock);

        engine.configure("", "", "Minimum", "Maximum", "Centroid");

        StringBuilder status = new StringBuilder();
        if (!engine.isReady(status)) {
            throw new RuntimeException("Engine not ready. "
                    + "The following errors were encountered:\n" + status.toString());
        }

//        for (int i = 0; i < 100; ++i) {
//            double light = ambient.getMinimum() + i * (ambient.range() / 50);
            double light=x;
        ambient.setInputValue(light);
            engine.process();
//            FuzzyLite.logger().info(String.format(
//                    "input = %s ->output = %s",
//                    Op.str(light), Op.str(power.getOutputValue())));
           return Op.str(power.getOutputValue());
      
    }
}