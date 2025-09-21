/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Noor Safia
 */

interface DocumentTemplate extends Cloneable {
    DocumentTemplate clone();
    void customize();
}

class ArticleTemplate implements DocumentTemplate {
    @Override
    public DocumentTemplate clone() {
        return new ArticleTemplate();
    }

    @Override
    public void customize() {
        System.out.println("Customizing Article layout and content.");
    }
}


class ReportTemplate implements DocumentTemplate {
    @Override
    public DocumentTemplate clone() {
        return new ReportTemplate();
    }

    @Override
    public void customize() {
        System.out.println("Customizing Report with sections and charts.");
    }
}


class BrochureTemplate implements DocumentTemplate {
    @Override
    public DocumentTemplate clone() {
        return new BrochureTemplate();
    }

    @Override
    public void customize() {
        System.out.println("Customizing Brochure with images and design.");
    }
}


public class DocumentGenerationSystem {
    
    public static void main(String[] args) {
        
        DocumentTemplate articleObj = new ArticleTemplate();
        DocumentTemplate reportObj = new ReportTemplate();
        DocumentTemplate brochureObj = new BrochureTemplate();

        DocumentTemplate article = articleObj.clone();
        article.customize();

        DocumentTemplate report = reportObj.clone();
        report.customize();

        DocumentTemplate brochure = brochureObj.clone();
        brochure.customize();
    }
    
}
