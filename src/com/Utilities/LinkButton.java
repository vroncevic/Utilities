package com.Utilities;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.Action;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalButtonUI;

/**
 * Java component LinkButton
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class LinkButton extends JButton {

    private static final long serialVersionUID = -7504564288265905013L;

    /**
     * ALWAYS_UNDERLINE ALWAYS_UNDERLINE flag
     */
    public static final int ALWAYS_UNDERLINE = 0;

    /**
     * HOVER_UNDERLINE HOVER_UNDERLINE flag
     */
    public static final int HOVER_UNDERLINE = 1;

    /**
     * NEVER_UNDERLINE NEVER_UNDERLINE flag
     */
    public static final int NEVER_UNDERLINE = 2;

    /**
     * SYSTEM_DEFAULT SYSTEM_DEFAULT flag
     */
    public static final int SYSTEM_DEFAULT = 3;

    /**
     * linkBehavior linkBehavior flag
     */
    private int linkBehavior;

    /**
     * Color linkColor linkColor contain color of link button
     */
    private Color linkColor;

    /**
     * Color colorPressed colorPressed contain color of pressed link button
     */
    private Color colorPressed;

    /**
     * Color visitedLinkColor visitedLinkColor contain color for visited link
     * button
     */
    private Color visitedLinkColor;

    /**
     * Color disabledLinkColor disabledLinkColor contain color for disable link
     * button
     */
    private Color disabledLinkColor;

    /**
     * URL buttonURL buttonURL contain URL
     */
    private URL buttonURL;

    /**
     * Action defaultAction defaultAction
     */
    private Action defaultAction;

    /**
     * boolean isLinkVisited isLinkVisited flag for checking link
     */
    private boolean isLinkVisited;

    public LinkButton() {
        this(null, null, null);
    }

    /**
     * LinkButton constructor
     *
     * @param action contain Action on press
     */
    public LinkButton(Action action) {
        this();
        setAction(action);
    }

    /**
     * LinkButton constructor
     *
     * @param icon contain image
     */
    public LinkButton(Icon icon) {
        this(null, icon, null);
    }

    /**
     * LinkButton constructor
     *
     * @param s contain name
     */
    public LinkButton(String s) {
        this(s, null, null);
    }

    /**
     * LinkButton constructor
     *
     * @param url contain URL
     */
    public LinkButton(URL url) {
        this(null, null, url);
    }

    /**
     * LinkButton constructor
     *
     * @param s contain name
     * @param url contain URL
     */
    public LinkButton(String s, URL url) {
        this(s, null, url);
    }

    /**
     * LinkButton constructor
     *
     * @param icon contain image
     * @param url contain image
     */
    public LinkButton(Icon icon, URL url) {
        this(null, icon, url);
    }

    /**
     * LinkButton constructor
     *
     * @param text contain name
     * @param icon contain image
     * @param url contain URL
     */
    public LinkButton(String text, Icon icon, URL url) {
        super(text, icon);
        linkBehavior = SYSTEM_DEFAULT;
        linkColor = Color.blue;
        colorPressed = Color.red;
        visitedLinkColor = new Color(128, 0, 128);
        if (text == null && url != null) {
            setText(url.toExternalForm());
        }
        setLinkURL(url);
        setCursor(Cursor.getPredefinedCursor(12));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setRolloverEnabled(true);
        addActionListener(defaultAction);
    }

    /**
     *
     * updateUI set UI for this component
     */
    @Override
    public void updateUI() {
        setUI(BasicLinkButtonUI.createUI(this));
    }

    /**
     * setDefault set default UI
     */
    public void setDefault() {
        UIManager.getDefaults().put("LinkButtonUI", "BasicLinkButtonUI");
    }

    /**
     * getUIClassID UI class ID return
     *
     * @return
     */
    @Override
    public String getUIClassID() {
        return "LinkButtonUI";
    }

    /**
     *
     * setupToolTipText set tool tip text
     */
    protected void setupToolTipText() {
        String tip = null;
        if (buttonURL != null) {
            tip = buttonURL.toExternalForm();
        }
        setToolTipText(tip);
    }

    /**
     * setLinkBehavior set behavior
     *
     * @param bnew contain new behavior
     */
    public void setLinkBehavior(int bnew) {
        checkLinkBehaviour(bnew);
        int old = linkBehavior;
        linkBehavior = bnew;
        firePropertyChange("linkBehavior", old, bnew);
        repaint();
    }

    /**
     * checkLinkBehaviour
     *
     * @param beha current behavior
     */
    private void checkLinkBehaviour(int beha) {
        if (beha != ALWAYS_UNDERLINE && beha != HOVER_UNDERLINE
                && beha != NEVER_UNDERLINE && beha != SYSTEM_DEFAULT) {
            throw new IllegalArgumentException("Not a legal LinkBehavior");
        }
    }

    /**
     * getLinkBehavior get behavior
     *
     * @return linkBehavior
     */
    public int getLinkBehavior() {
        return linkBehavior;
    }

    /**
     * setLinkColor set color
     *
     * @param color contain color
     */
    public void setLinkColor(Color color) {
        Color colorOld = linkColor;
        linkColor = color;
        firePropertyChange("linkColor", colorOld, color);
        repaint();
    }

    /**
     * getLinkColor get color
     *
     * @return linkColor
     */
    public Color getLinkColor() {
        return linkColor;
    }

    /**
     * setActiveLinkColor active link
     *
     * @param colorNew contain fresh color
     */
    public void setActiveLinkColor(Color colorNew) {
        Color colorOld = colorPressed;
        colorPressed = colorNew;
        firePropertyChange("activeLinkColor", colorOld, colorNew);
        repaint();
    }

    /**
     * getActiveLinkColor get active color
     *
     * @return colorPressed
     */
    public Color getActiveLinkColor() {
        return colorPressed;
    }

    /**
     * setDisabledLinkColor disable link buttion
     *
     * @param color contain color
     */
    public void setDisabledLinkColor(Color color) {
        Color colorOld = disabledLinkColor;
        disabledLinkColor = color;
        firePropertyChange("disabledLinkColor", colorOld, color);
        if (!isEnabled()) {
            repaint();
        }
    }

    /**
     * getDisabledLinkColor get disable color
     *
     * @return disabledLinkColor
     */
    public Color getDisabledLinkColor() {
        return disabledLinkColor;
    }

    /**
     * setVisitedLinkColor set color link is visited
     *
     * @param colorNew
     */
    public void setVisitedLinkColor(Color colorNew) {
        Color colorOld = visitedLinkColor;
        visitedLinkColor = colorNew;
        firePropertyChange("visitedLinkColor", colorOld, colorNew);
        repaint();
    }

    /**
     * getVisitedLinkColor get color if link is visited
     *
     * @return visitedLinkColor
     */
    public Color getVisitedLinkColor() {
        return visitedLinkColor;
    }

    /**
     * getLinkURL get URL
     *
     * @return buttonURL contain URL
     */
    public URL getLinkURL() {
        return buttonURL;
    }

    /**
     * setLinkURL set URL
     *
     * @param url for setting URL
     */
    public void setLinkURL(URL url) {
        URL urlOld = buttonURL;
        buttonURL = url;
        setupToolTipText();
        firePropertyChange("linkURL", urlOld, url);
        revalidate();
        repaint();
    }

    /**
     * setLinkVisited - link is visited
     *
     * @param flagNew contain value for visited
     */
    public void setLinkVisited(boolean flagNew) {
        boolean flagOld = isLinkVisited;
        isLinkVisited = flagNew;
        firePropertyChange("linkVisited", flagOld, flagNew);
        repaint();
    }

    /**
     * isLinkVisited check state of link
     *
     * @return isLinkVisited current state of visited
     */
    public boolean isLinkVisited() {
        return isLinkVisited;
    }

    /**
     * setDefaultAction set Action to link button
     *
     * @param actionNew contain Action
     */
    public void setDefaultAction(Action actionNew) {
        Action actionOld = defaultAction;
        defaultAction = actionNew;
        firePropertyChange("defaultAction", actionOld, actionNew);
    }

    /**
     * getDefaultAction nothing
     *
     * @return defaultAction for link button
     */
    public Action getDefaultAction() {
        return defaultAction;
    }

    /**
     * paramString generate parameter for link button
     *
     * @return string
     */
    @Override
    protected String paramString() {
        String str;
        if (linkBehavior == ALWAYS_UNDERLINE) {
            str = "ALWAYS_UNDERLINE";
        } else if (linkBehavior == HOVER_UNDERLINE) {
            str = "HOVER_UNDERLINE";
        } else if (linkBehavior == NEVER_UNDERLINE) {
            str = "NEVER_UNDERLINE";
        } else {
            str = "SYSTEM_DEFAULT";
        }
        String colorStr = linkColor == null ? "" : linkColor.toString();
        String colorPressStr = colorPressed == null ? "" : colorPressed
                .toString();
        String disabledLinkColorStr = disabledLinkColor == null ? ""
                : disabledLinkColor.toString();
        String visitedLinkColorStr = visitedLinkColor == null ? ""
                : visitedLinkColor.toString();
        String buttonURLStr = buttonURL == null ? "" : buttonURL.toString();
        String isLinkVisitedStr = isLinkVisited ? "true" : "false";
        return super.paramString() + ",linkBehavior=" + str + ",linkURL="
                + buttonURLStr + ",linkColor=" + colorStr + ",activeLinkColor="
                + colorPressStr + ",disabledLinkColor=" + disabledLinkColorStr
                + ",visitedLinkColor=" + visitedLinkColorStr
                + ",linkvisitedString=" + isLinkVisitedStr;
    }
}

/**
 * BasicLinkButtonUI class for UI link button
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
class BasicLinkButtonUI extends MetalButtonUI {

    private static final BasicLinkButtonUI ui = new BasicLinkButtonUI();

    /**
     * Basic constructor
     */
    public BasicLinkButtonUI() {

    }

    /**
     * createUI create component
     *
     * @param jcomponent
     * @return ComponentUI
     */
    public static ComponentUI createUI(JComponent jcomponent) {
        return ui;
    }

    /**
     * paintText make hyper link text
     */
    @Override
    protected void paintText(Graphics g, JComponent com, Rectangle rect, String s) {
        LinkButton bn = (LinkButton) com;
        ButtonModel bnModel = bn.getModel();
        bn.getForeground();
        if (bnModel.isEnabled()) {
            if (bnModel.isPressed()) {
                bn.setForeground(bn.getActiveLinkColor());
            } else if (bn.isLinkVisited()) {
                bn.setForeground(bn.getVisitedLinkColor());
            } else {
                bn.setForeground(bn.getLinkColor());
            }
        } else {
            if (bn.getDisabledLinkColor() != null) {
                bn.setForeground(bn.getDisabledLinkColor());
            }
        }
        super.paintText(g, com, rect, s);
        int behaviour = bn.getLinkBehavior();
        boolean drawLine = false;
        if (behaviour == LinkButton.HOVER_UNDERLINE) {
            if (bnModel.isRollover()) {
                drawLine = true;
            }
        } else if (behaviour == LinkButton.ALWAYS_UNDERLINE || behaviour == LinkButton.SYSTEM_DEFAULT) {
            drawLine = true;
        }
        if (!drawLine) {
            return;
        }
        FontMetrics fm = g.getFontMetrics();
        int x = rect.x + getTextShiftOffset();
        int y = (rect.y + fm.getAscent() + fm.getDescent() + getTextShiftOffset()) - 1;
        if (bnModel.isEnabled()) {
            g.setColor(bn.getForeground());
            g.drawLine(x, y, (x + rect.width) - 1, y);
        } else {
            g.setColor(bn.getBackground().brighter());
            g.drawLine(x, y, (x + rect.width) - 1, y);
        }
    }
}
