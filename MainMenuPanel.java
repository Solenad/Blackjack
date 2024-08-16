import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.ColorModel;
import java.util.Locale;

public class MainMenuPanel {
    private JPanel mainMenuPanel;
    private JPanel mainMenuHeader;
    private JLabel mainMenuTitleLbl;
    private JLabel mainMenuAuthorLbl;
    private JPanel mainMenuButtonPanel;
    private JButton playBtn;

    public JPanel getMainMenuPanel() {
        return this.mainMenuPanel;
    }

    public void setPlayBtnListener(ActionListener actionListener) {
        this.playBtn.addActionListener(actionListener);
    }

    public void setPlayBtnMouseListener(MouseListener mouseListener) {
        this.playBtn.addMouseListener(mouseListener);
    }

    public void setPlayBtnColor(Color color) {
        this.playBtn.setForeground(color);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new BorderLayout(0, 5));
        mainMenuPanel.setBackground(new Color(-15987698));
        mainMenuPanel.setFocusable(true);
        mainMenuPanel.setPreferredSize(new Dimension(600, 427));
        mainMenuHeader = new JPanel();
        mainMenuHeader.setLayout(new GridBagLayout());
        mainMenuHeader.setBackground(new Color(-15987698));
        mainMenuHeader.setEnabled(true);
        mainMenuPanel.add(mainMenuHeader, BorderLayout.NORTH);
        mainMenuTitleLbl = new JLabel();
        mainMenuTitleLbl.setBackground(new Color(-5328458));
        mainMenuTitleLbl.setEnabled(true);
        Font mainMenuTitleLblFont = this.$$$getFont$$$("Comic Sans MS", Font.BOLD, 76, mainMenuTitleLbl.getFont());
        if (mainMenuTitleLblFont != null) mainMenuTitleLbl.setFont(mainMenuTitleLblFont);
        mainMenuTitleLbl.setForeground(new Color(-2104859));
        mainMenuTitleLbl.setHorizontalAlignment(0);
        mainMenuTitleLbl.setHorizontalTextPosition(4);
        mainMenuTitleLbl.setInheritsPopupMenu(false);
        mainMenuTitleLbl.setMaximumSize(new Dimension(100, 50));
        mainMenuTitleLbl.setMinimumSize(new Dimension(30, 50));
        mainMenuTitleLbl.setOpaque(false);
        mainMenuTitleLbl.setPreferredSize(new Dimension(400, 120));
        mainMenuTitleLbl.setText("Blackjack");
        mainMenuTitleLbl.setVerticalAlignment(0);
        mainMenuTitleLbl.setVerticalTextPosition(3);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(50, 0, 0, 0);
        mainMenuHeader.add(mainMenuTitleLbl, gbc);
        mainMenuAuthorLbl = new JLabel();
        mainMenuAuthorLbl.setAlignmentY(0.0f);
        mainMenuAuthorLbl.setAutoscrolls(false);
        mainMenuAuthorLbl.setBackground(new Color(-13470673));
        mainMenuAuthorLbl.setEnabled(true);
        mainMenuAuthorLbl.setFocusable(false);
        Font mainMenuAuthorLblFont = this.$$$getFont$$$("JetBrains Mono", Font.BOLD, 19, mainMenuAuthorLbl.getFont());
        if (mainMenuAuthorLblFont != null) mainMenuAuthorLbl.setFont(mainMenuAuthorLblFont);
        mainMenuAuthorLbl.setForeground(new Color(-2104859));
        mainMenuAuthorLbl.setHorizontalAlignment(0);
        mainMenuAuthorLbl.setHorizontalTextPosition(0);
        mainMenuAuthorLbl.setOpaque(false);
        mainMenuAuthorLbl.setText("Roe Dizon");
        mainMenuAuthorLbl.setVisible(true);
        mainMenuAuthorLbl.putClientProperty("html.disable", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 50, 5);
        mainMenuHeader.add(mainMenuAuthorLbl, gbc);
        mainMenuButtonPanel = new JPanel();
        mainMenuButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));
        mainMenuButtonPanel.setBackground(new Color(-15987698));
        Font mainMenuButtonPanelFont = this.$$$getFont$$$("Droid Sans Mono", Font.BOLD, 16, mainMenuButtonPanel.getFont());
        if (mainMenuButtonPanelFont != null) mainMenuButtonPanel.setFont(mainMenuButtonPanelFont);
        mainMenuButtonPanel.setMaximumSize(new Dimension(200, 100));
        mainMenuButtonPanel.setPreferredSize(new Dimension(300, 200));
        mainMenuPanel.add(mainMenuButtonPanel, BorderLayout.CENTER);
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        mainMenuButtonPanel.add(spacer1);
        playBtn = new JButton();
        playBtn.setBackground(new Color(-8552573));
        playBtn.setBorderPainted(false);
        playBtn.setContentAreaFilled(false);
        playBtn.setDefaultCapable(false);
        playBtn.setFocusPainted(false);
        Font playBtnFont = this.$$$getFont$$$("Droid Sans Mono", Font.BOLD, 28, playBtn.getFont());
        if (playBtnFont != null) playBtn.setFont(playBtnFont);
        playBtn.setForeground(new Color(-2104859));
        playBtn.setLabel("Play");
        playBtn.setMaximumSize(new Dimension(96, 50));
        playBtn.setPreferredSize(new Dimension(96, 40));
        playBtn.setText("Play");
        mainMenuButtonPanel.add(playBtn);
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        mainMenuPanel.add(spacer2, BorderLayout.SOUTH);
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        mainMenuPanel.add(spacer3, BorderLayout.WEST);
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        mainMenuPanel.add(spacer4, BorderLayout.EAST);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainMenuPanel;
    }

}
