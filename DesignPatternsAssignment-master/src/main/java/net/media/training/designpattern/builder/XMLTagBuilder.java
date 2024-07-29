package net.media.training.designpattern.builder;
import java.util.*;

public class XMLTagBuilder {
    public Map<String, String> attributeMap;
    public List<String> children;
    public String tagName;
    public Boolean isRoot;

    public XMLTagBuilder(String tagName, Boolean isRoot) {
        this.attributeMap = new LinkedHashMap<>();
        this.children = new ArrayList<>();
        this.tagName = tagName;
        this.isRoot = isRoot;
    }

    public XMLTagBuilder(String tagName) {
        this.attributeMap = new LinkedHashMap<>();
        this.children = new ArrayList<>();
        this.tagName = tagName;
        this.isRoot = false;
    }

    public XMLTagBuilder attribute(String key, String value) {
        attributeMap.put(key, value);
        return this;
    }

    public XMLTagBuilder children(String value) {
        children.add(value);
        return this;
    }

    public String build() {
        if(this.isRoot) {
            String finalString = "<?xml";
            for (String key : this.attributeMap.keySet()) {
                finalString += " " + key + "=" + "\"" + this.attributeMap.get(key) + "\"";
            }
            finalString += "?>";
            return finalString;
        }
        else {
            String finalString = "<" + this.tagName;
            for (String key : this.attributeMap.keySet()) {
                finalString += " " + key + "=" + "\"" + this.attributeMap.get(key) + "\"";
            }
            finalString += ">";

            for(int i = 0; i < this.children.size(); i++) {
                finalString += this.children.get(i);
            }

            finalString += "</" + this.tagName + ">";
            return finalString;
        }
    }
}
